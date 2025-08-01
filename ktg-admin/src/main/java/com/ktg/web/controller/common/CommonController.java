package com.ktg.web.controller.common;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.ktg.common.core.domain.AjaxResult;
import com.ktg.common.utils.file.FileUploadUtils;
import com.ktg.common.utils.file.FileUtils;

/**
 * 通用请求处理
 */
@RestController
@RequestMapping("/common")
public class CommonController
{
    @PostMapping("/uploadMinio")
    public AjaxResult uploadFileMinio(MultipartFile file) throws Exception{
        try{
            String fileName = FileUploadUtils.uploadMinio(file);
            AjaxResult rt = AjaxResult.success();
            rt.put("url",fileName);
            rt.put("fileName",fileName);
            rt.put("newFileName",FileUtils.getName(fileName));
            rt.put("originalFileName",file.getOriginalFilename());
            return rt;
        }catch (Exception e){
            return AjaxResult.error(e.getMessage());
        }
    }
}
