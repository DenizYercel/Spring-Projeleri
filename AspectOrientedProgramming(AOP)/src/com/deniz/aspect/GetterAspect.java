package com.deniz.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GetterAspect {
	
/*	@Before("execution (* get*(*))")
	public void  beforeGetterAdvice() {
		
		System.out.println("before beforeGetterAdvice called");
	} */
	
	
	//Kod tekrarýný önlemek için þöyle yöntem var:
	
	@Pointcut("execution (* get*(*))")
	private void getterPC() {
		
	}
	//birden fazla pointcut olabilir
/*	@Pointcut("execution (* getSoyisim(*))")
	private void getterSoyisimPC() {
		
	} */
	
	
	
	
	
	/*   @Pointcut("execution (* get*(*))")
		private void getterPC() {
		
		}
			@Pointcut("execution (* *sim*(*))")
			private void simPC() {
		
		}
		
		AND 
		@Pointcut("getterPC() && simPC()")
		private void logMesaj(){
		System.out.println("iki tane pointcut doðruysa  called");
		
		}
		
		OR
		@Pointcut("getterPC() || simPC()")
		private void logMesaj(){
		System.out.println("iki tane pointcut doðruysa  called");
		
		}
	
	 * */
	
	@Before("getterPC()")
	public void  beforeGetterAdvice() {
		
		System.out.println("before beforeGetterAdvice called");
	} 
	
	@Before("getterPC()")
	public void logMesaj() {
		System.out.println("logluyoruz");
	}
	
	@Before("getterPC()")
	public void logToFile() {
		System.out.println("logToFile");
	}

}
