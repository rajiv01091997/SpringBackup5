package com.glo.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggingAdvice {


Logger logger=LoggerFactory.getLogger("LoggidnAdvice.class");

   @Before("execution(* com.glo.Service.FleetServiceImpl.*(..))")
   public void beforeExecution(JoinPoint jp)
   {
	   String methodName=jp.getSignature().getName();
	   logger.info("Call Starting for method: "+methodName);
   }
   @AfterReturning(pointcut="execution(* com.glo.Service.FleetServiceImpl.*(..))",returning="result")
   public void afterReturning(JoinPoint jp,Object result)
   {  
	   String methodName=jp.getSignature().getName();
	   if(result!=null)
		   System.out.println("call complete for method name: "+methodName+"||Result->"+result);
	   else
		   System.out.println("call complete for method name: "+methodName+"||Result->"+" Nothing returned");
   }
   
   @AfterThrowing("execution(* com.glo.Service.FleetServiceImpl.*(..))")
   public void afterThrowing()
   {
	   logger.error("This Id is not present in Repository");
   }
	
//	@Around("execution(* com.glo.Service.FleetServiceImpl.*(..))")
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
