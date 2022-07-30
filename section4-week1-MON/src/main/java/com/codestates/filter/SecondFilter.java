package com.codestates.filter;


import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("secondFilter가 생성되었습니다.");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("==========Second 필터 시작==========");
        chain.doFilter(request,response);
        System.out.println("==========Second 필터 종료==========");
    }

    public void destroy(){
        System.out.println("secondFilter가 사라집니다.");
        Filter.super.destroy();
    }
}
