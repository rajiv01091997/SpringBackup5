package com.glo.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice {
	
//	Logger logger=LoggerFactory.getLogger("LoggidnAdvice.class");
//	
//	@Around("execution(* com.glo.*.*.*(..))")
//	public Object aroundMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable
//	{
//		String methodName=joinPoint.getSignature().getName();
//		String className=joinPoint.getTarget().getClass().toString();
//		Object[] array=joinPoint.getArgs();
//		long startTime=System.currentTimeMillis();
//		Object result=joinPoint.proceed();
//		long endTime=System.currentTimeMillis();
//		System.out.println("Method "+methodName+" execution Time "+(endTime-startTime)+" ms");
//		return result;
//	}
	

}
