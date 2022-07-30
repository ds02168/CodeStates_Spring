package com.codestates.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("FirstFilter 생성");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        System.out.println("========First 필터 시작========");
        chain.doFilter(request,response);
        System.out.println("========First 필터 종료========");
    }

    public void destory(){
        System.out.println("FirstFilter 사라짐");
        Filter.super.destroy();
    }
}
