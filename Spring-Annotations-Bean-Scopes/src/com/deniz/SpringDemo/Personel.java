package com.deniz.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Personel {
	private String isim;
	private String soyisim;
	
	
	public Personel(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	
	@PostConstruct
	private void initPersonel() {
		System.out.println("personel init method");
	}
	
	@PreDestroy
	private void destroyPersonel() {
		System.out.println("personel destroy method");
	}
	
	public Personel() {
		System.out.println("default constructor");
	}



	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getSoyisim() {
		return soyisim;
	}


	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	
	

}
