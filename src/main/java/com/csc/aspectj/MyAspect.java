package com.csc.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class MyAspect {
    @Before("execution(* add(..))")
    public void before(){
        System.out.println("这是前置增强");
    }

    @AfterReturning("execution(* add(..))")
    public void after(){
        System.out.println("这是后置增强");
    }
    @Around("execution(* add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("这是环绕增强上");
        proceedingJoinPoint.proceed();
        System.out.println("这是环绕增强下");
    }
    @AfterThrowing("execution(* add(..))")
    public void exception1(){
        System.out.println("这是异常增强");
    }
}
