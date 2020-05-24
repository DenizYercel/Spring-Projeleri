package com.deniz.SpringJavaConfigDIConst;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:car.properties")
public class JavaConfig {
	
	
	@Value("${mercedes.model}")
	private String model;
	
	@Bean
	public Motor dizel() {
		return new DizelMotor();
	}
	
	@Bean
	public Motor benzinli() {
		return new BenzinliMotor();
	}
	
	@Bean
	public Mercedes mercedes() {
		//constructor injection
	//	Mercedes m=new Mercedes("E200",benzinli());
		
		
		Mercedes m=new Mercedes(model,dizel());
		return m;
	}

}
