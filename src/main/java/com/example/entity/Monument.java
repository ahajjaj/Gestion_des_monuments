package com.example.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Monument implements Serializable   {
	@Id
	@GeneratedValue
	private String codeM;
	private String nomM;
	private String proprietaire;
	private String typeMonument;
	private Float longitude;
	private Float latitude;
	private String codeLieu;
	@ManyToMany(mappedBy = "monuments")
	private List<Celebrite> celebrites;
	
	@ManyToOne 
	private Lieu lieu;
	
// pour jpa
	public Monument() {
		super();
	}
	public Monument(String codeM, String nomM, String proprietaire, String typeMonument, Float longitude,
			Float latitude, String codeLieu, List<Celebrite> celebrites, Lieu lieu) {
		super();
		this.codeM = codeM;
		this.nomM = nomM;
		this.proprietaire = proprietaire;
		this.typeMonument = typeMonument;
		this.longitude = longitude;
		this.latitude = latitude;
		this.codeLieu = codeLieu;
		this.celebrites = celebrites;
		this.lieu = lieu;
	}
	public String getCodeM() {
		return codeM;
	}
	public void setCodeM(String codeM) {
		this.codeM = codeM;
	}


	public String getNomM() {
		return nomM;
	}


	public void setNomM(String nomM) {
		this.nomM = nomM;
	}


	public String getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}


	public String getTypeMonument() {
		return typeMonument;
	}


	public void setTypeMonument(String typeMonument) {
		this.typeMonument = typeMonument;
	}


	public Float getLongitude() {
		return longitude;
	}


	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}


	public Float getLatitude() {
		return latitude;
	}


	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}


	
	}
	
	
	
	


