package com.deniz.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class GetterAspect {
	
/*	@Before("execution (* get*(*))")
	public void  beforeGetterAdvice() {
		
		System.out.println("before beforeGetterAdvice called");
	} */
	

	
	@Pointcut("execution (* get*(*))")
	private void getterPC() {
		
	}
	
	@Before("getterPC()")
	public void  logMesaji() {
		
		System.out.println("getter called");
	} 
	
	
	@Pointcut("execution (* set*(*))")
	private void setterPC() {
		
	}
	
	@Before("setterPC()")
	public void  logMesaji2(JoinPoint jp) {
		
		System.out.println("setter called");
		
		MethodSignature ms=(MethodSignature)jp.getSignature();
		
		Object[] args=jp.getArgs();
		System.out.println("method ="+ms.getDeclaringTypeName());
		System.out.println(ms.getMethod());
		System.out.println("Parametreler");
		for(Object arg:args) {
			System.out.println(arg);
		}
	} 
	

}
