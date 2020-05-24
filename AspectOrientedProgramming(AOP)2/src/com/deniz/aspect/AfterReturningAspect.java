package com.deniz.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.deniz.aop.entity.Student;

@Aspect
@Component
public class AfterReturningAspect {
	
	@Pointcut("execution (* getAdSoyad())")
	private void getAdSoyadPC() {
		
	}
	
	@AfterReturning(pointcut = "getAdSoyadPC()",returning = "result")
	public void  adSoyadIzle(JoinPoint jp,String result) {
		
		System.out.println("getAdSoyad called");
		System.out.println(jp.getSignature());
		System.out.println("Sonuç: "+result);
	} 
	
	
	
	@Pointcut("execution (* getKanka())")
	private void getKankaPC() {
		
	}
	
	@AfterReturning(pointcut = "getKankaPC()",returning = "kanka")
	public void  getKankaIzle(JoinPoint jp,Student kanka) {
		
		kanka.setIsim("hakan");
	} 


}
