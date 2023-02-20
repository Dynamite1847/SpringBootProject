package com.learnSpringBoot.config;

import com.learnSpringBoot.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {

    //注册Servlet对象
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        //public ServletRegistrationBean(T servlet, String... urlMappings)
        //Params:
        //servlet – the servlet being mapped urlMappings – the URLs being mapped
        ServletRegistrationBean bean = new ServletRegistrationBean<>();
        bean.setServlet( new MyServlet());
        bean.addUrlMappings("/login","/test");
        return bean;
    }
}
