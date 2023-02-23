package com.learnSpringBoot.config;

import com.learnSpringBoot.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebSystemConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean reg = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return reg;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        //使用框架中的过滤器类
        CharacterEncodingFilter filter = new CharacterEncodingFilter();

        filter.setEncoding("utf-8");

        filter.setForceEncoding(true);

        filterRegistrationBean.setFilter(filter);

        filterRegistrationBean.addUrlPatterns("/*");
        
        return filterRegistrationBean;
    }
}
