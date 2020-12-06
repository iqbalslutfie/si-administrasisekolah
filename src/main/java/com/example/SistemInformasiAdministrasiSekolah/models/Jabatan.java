package com.example.SistemInformasiAdministrasiSekolah.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jabatan")
public class Jabatan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long kodeJabatan;
	
	@Column(name = "nama")
	private String namaJabatan;

	public Jabatan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jabatan(long kodeJabatan, String namaJabatan) {
		super();
		this.kodeJabatan = kodeJabatan;
		this.namaJabatan = namaJabatan;
	}

	public long getKodeJabatan() {
		return kodeJabatan;
	}

	public void setKodeJabatan(long kodeJabatan) {
		this.kodeJabatan = kodeJabatan;
	}

	public String getNamaJabatan() {
		return namaJabatan;
	}

	public void setNamaJabatan(String namaJabatan) {
		this.namaJabatan = namaJabatan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
