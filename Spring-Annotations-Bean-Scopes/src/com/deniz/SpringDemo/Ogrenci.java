package com.deniz.SpringDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ogrenci {
	private String isim;
	private String soyisim;
	
	
	public Ogrenci(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	
	@PostConstruct
	public void initOgrenci() {
		System.out.println("ogrenci init method");
	}
	
	@PreDestroy
	public void destroyOgrenci() {
		System.out.println("ogrenci destroy method");
	}
	
	public Ogrenci() {
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
