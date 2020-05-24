package com.deniz.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class IsimAspect {
	

	
	@Pointcut("execution (* *sim(*))")
	public void getterIsimPC() {
		
	} 
	
	
	
	@Before("getterIsimPC()")
	public void  beforeGetterAdvice() {
		
		System.out.println("before isim called");
	} 
	
	

}
