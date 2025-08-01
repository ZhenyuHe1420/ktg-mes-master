package com.ktg;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动程序
 */
@EnableAsync
@ImportResource("classpath:ureport-console-context.xml")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  KTG-MES启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }

    @Bean
    public ServletRegistrationBean urportServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new UReportServlet());
        bean.addUrlMappings("/ureport/*");
        return bean;
    }
}
