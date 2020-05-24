package com.deniz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "KURS")
public class Kurs {
	
	@Id
	@Column(name ="ID")
	@SequenceGenerator(name = "kurs_seq",sequenceName = "KURS_SEQ",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "kurs_seq")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name = "OGRETMEN_ID")
	private Ogretmen ogretmen;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "OGRENCI_KURS",joinColumns = @JoinColumn(name="KURS_ID"),
	inverseJoinColumns =@JoinColumn(name="OGRENCI_ID") )
	private List<Ogrenci> ogrenciler;
	
	
	
	@Column(name = "KURS_ADI")
	private String kursAdi;
	
	@Column(name = "SAAT")
	private int saat;
	

	public Kurs() {
		super();
	}

	public Kurs(Ogretmen ogretmen, String kursAdi, int saat) {
		super();
		this.ogretmen = ogretmen;
		this.kursAdi = kursAdi;
		this.saat = saat;
	}


	
	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}



	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getKursAdi() {
		return kursAdi;
	}



	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}



	public int getSaat() {
		return saat;
	}



	public void setSaat(int saat) {
		this.saat = saat;
	}


	public Ogretmen getOgretmen() {
		return ogretmen;
	}


	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}
	
	public void addOgrenci(Ogrenci o ) {
		if(ogrenciler==null) {
			ogrenciler=new ArrayList<Ogrenci>();
		}
		ogrenciler.add(o);
	}



	@Override
	public String toString() {
		return "Kurs [id=" + id + ", ogretmen=" + ogretmen + ", kursAdi=" + kursAdi + ", saat=" + saat + "]";
	}


	
	
}
