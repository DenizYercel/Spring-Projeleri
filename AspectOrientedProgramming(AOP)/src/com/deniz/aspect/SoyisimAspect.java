package com.deniz.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SoyisimAspect {
	
	
	
	@Before("com.deniz.aspect.IsimAspect.getterIsimPC()")
	public void  beforeGetterAdvice() {
		
		System.out.println("before Soyisim called");
	} 
	
	

}
