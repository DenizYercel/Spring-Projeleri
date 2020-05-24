package com.deniz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.deniz.entity.Personel;

@Configuration
@ComponentScan
public class SpringDemoConfig {
	
	
	@Bean                                   
	public Personel deniz() {
		Personel p= new Personel();
		p.setIsim("deniz");
		p.setYas(22);
		return p;
	}
	
	@Bean
	public Personel personel() {
		return new Personel();
	}

}
