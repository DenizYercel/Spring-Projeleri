package com.deniz.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// @Aspect
@Component
public class ErrorAspect {
	

	
	@Pointcut("execution (* *(..))")
	private void getterPC() {
		
	}
	
	@After("getterPC()")
	public void after(){
		
		System.out.println("after finally");
		
	}
	
	
	@AfterReturning("getterPC()")
	public void afterReturning(JoinPoint jp) {
		System.out.println("after returning " +jp.getSignature() );
	}
	
	@AfterThrowing(throwing = "exc", pointcut = "getterPC()")
	public void logError(JoinPoint jp,Throwable exc){
		
		System.out.println("Hangi method :" +jp.getSignature());
		
		System.out.println("Hatali kod after throwing " + exc);
		
		}
		

	
}
