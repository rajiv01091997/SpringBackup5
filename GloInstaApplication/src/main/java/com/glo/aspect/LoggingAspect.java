package com.glo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
Logger logger=LoggerFactory.getLogger("LoggingAspect.class");

    @Before("execution(* com.glo.service.serviceImpl.PostServiceImpl.*(..))")
    public void beforeExecution(JoinPoint jp)
    {
        String methodName=jp.getSignature().getName();
        logger.info("Call Starting for method: "+methodName);
    }
    @AfterReturning(pointcut ="execution(* com.glo.service.serviceImpl.PostServiceImpl.*(..))",returning="result")
    public void afterReturning(JoinPoint jp,Object result)
    {
        String methodName=jp.getSignature().getName();
        if(result!=null)
            System.out.println("call complete for method name: "+methodName+"||Result->"+result);
        else
            System.out.println("call complete for method name: "+methodName+"||Result->"+" Nothing returned");
    }

    @AfterThrowing("execution(* com.glo.service.serviceImpl.PostServiceImpl.*(..))")
    public void afterThrowing()
    {
      logger.error("Id not found");
    }


}
