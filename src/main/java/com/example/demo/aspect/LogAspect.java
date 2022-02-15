package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class LogAspect {

    public void beforeServiceMethodInvocation(JoinPoint jp){
        System.out.println("Invocation of method" + jp.getSignature() );
    }

    public void aroundServiceMethodExecution(ProceedingJoinPoint jp){
        long start  = System.currentTimeMillis();
        System.out.println("Invocation of method" + jp.getSignature() );
    }

    public void master(){
        System.out.println("master");
    }

}
