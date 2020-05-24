package com.deniz.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class GetterAspect2 {
	
	
	@Pointcut("execution (* get*(*))")
	private void getterPC() {
		
	}
	
	
	@Before("getterPC()")
	public void  beforeGetterAdvice() {
		
		System.out.println("before getter called");
	} 
	

}
