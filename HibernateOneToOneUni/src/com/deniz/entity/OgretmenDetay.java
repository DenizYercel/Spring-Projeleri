package com.deniz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OGRETMEN_DETAY")
public class OgretmenDetay {
	
	@Id
	@Column(name="ID")
	@SequenceGenerator(name="ogretmen_dty_seq",sequenceName = "OGRETMEN_DETAY_SEQ",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ogretmen_dty_seq")
	private int id;
	
	@Column(name="EXPERTISE")
	private String expertise;
	
	@Column(name="HOBBY")
	private String hobby;
	
	@Column(name="WEBSITE")
	private String website;
	
	@Column(name = "FB_PAGE")
	private String fbPage;
	
	
	

	public OgretmenDetay(String expertise, String hobby, String website, String fbPage) {
		super();
		this.expertise = expertise;
		this.hobby = hobby;
		this.website = website;
		this.fbPage = fbPage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFbPage() {
		return fbPage;
	}

	public void setFbPage(String fbPage) {
		this.fbPage = fbPage;
	}
	
	
	
	

}
