package com.example.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lieu implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String codeInsee;
	@ManyToOne
	private Departement departement;
	private String dep;
	private String nomCom;
	private Float longitude;
	private Float latitude;
	@OneToMany(mappedBy = "codeLieu")
private List<Monument>monuments;	
	
	public Lieu() {
		super();
	}
	public Lieu(String codeInsee, Departement departement, String dep, String nomCom, Float longitude, Float latitude,
			List<Monument> monuments) {
		super();
		this.codeInsee = codeInsee;
		this.departement = departement;
		this.dep = dep;
		this.nomCom = nomCom;
		this.longitude = longitude;
		this.latitude = latitude;
		this.monuments = monuments;
	}


	public String getCodeInsee() {
		return codeInsee;
	}

	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getNomCom() {
		return nomCom;
	}

	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
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
