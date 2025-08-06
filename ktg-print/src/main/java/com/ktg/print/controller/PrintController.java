package com.ktg.print.controller;

import com.ktg.common.core.domain.AjaxResult;
import com.ktg.print.domain.PrintBarcodeModel;
import com.ktg.print.protocol.PrintMessageProto;
import com.ktg.print.server.PrintClientInfoMessageHandler;
import com.ktg.print.server.PrintServerDefaultHandler;
import com.ktg.print.service.IPrintService;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/print/barcodePrint")
public class PrintController {
    @Autowired
    private IPrintService iPrintService;

    /**
     * 条码打印公共接口
     */
    @PostMapping("/printing")
    public AjaxResult printBarcodeLabel(@RequestBody PrintBarcodeModel printBarcodeModel) {
        Map<String, Object> result = iPrintService.printLabel(printBarcodeModel);
        String clientIp = "";
        PrintMessageProto.Printer msg = null;
        if (!"SUCESS".equals(result.get("msg"))) {
            return AjaxResult.error(result.get("data").toString());
        } else {
            clientIp = result.get("clientIp").toString();
            msg = (PrintMessageProto.Printer) result.get("data");
        }
        // 获取信道数据并发送消息对象给指定打印机客户端
        //打印机名称和打印机客户端地址映射   一对一关系
        ConcurrentHashMap<String, SocketAddress> socketAddress = PrintClientInfoMessageHandler.socketAddressMap;
        //根据客户端和通道信息
        ConcurrentHashMap<SocketAddress, Channel> channels = PrintServerDefaultHandler.chanelMap;
        if (channels.isEmpty()
                || socketAddress.isEmpty()
                || socketAddress.get(clientIp) == null
                || channels.get(socketAddress.get(clientIp)) == null) {
            return AjaxResult.error("打印机客户端连接异常" + "(" + clientIp + ")");
        }
        Channel channel = channels.get(socketAddress.get(clientIp));
        channel.writeAndFlush(msg);
        return AjaxResult.success("打印成功");
    }
}

