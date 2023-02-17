package com.learnSpringBoot;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    /*
    return true： 请求能被处理
    return false： 请求被截断
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
