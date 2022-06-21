package com.example.cmarket.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAop {

    @Around("execution(* com.example.cmarket..*(..))")
    public Object logging(ProceedingJoinPoint joinPoint)  throws Throwable{
        long startTime = System.currentTimeMillis();
        String name = joinPoint.toString();
        try{
            return joinPoint.proceed();
        }finally{
            long endTime = System.currentTimeMillis();
            long callTime = endTime - startTime;
            System.out.println(name + " = " + callTime);
        }
    }
}
