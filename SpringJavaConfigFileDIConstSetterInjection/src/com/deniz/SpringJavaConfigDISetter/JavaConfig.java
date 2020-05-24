package com.deniz.SpringDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
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
		Mercedes m=new Mercedes();
		m.setMotor(dizel());
		return m;
	}

}
