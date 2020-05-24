package com.deniz.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect  // ErrorAspect de aspect kapalý
@Component
public class AroundAspect {
	

	
	@Pointcut("execution (* getIsim(..))")
	private void getterPC() {
		
	}
	
	
	@Around("getterPC()")
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println(pjp.getSignature());
		
		System.out.println("before");
		long begin=System.currentTimeMillis();
		
		Object result=pjp.proceed();
		
		long end=System.currentTimeMillis();
		long sure=end-begin;
		System.out.println("after");
		System.out.println("Program " + sure + " ms surdu");
		return result;
	}
	

	
}
