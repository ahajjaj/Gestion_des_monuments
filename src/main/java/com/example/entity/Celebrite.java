package com.example.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Celebrite implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	/*@GeneratedValue*/
	private Integer numCelebrite;
	private String nom;
	private String prenom;
	private String nationalite;
	private String epoque;
	@ManyToMany
	@JoinTable(name = "AssocieA", inverseJoinColumns= {@JoinColumn(name="CodeM")}, joinColumns = {@JoinColumn(name="numCelebrite")})
	private List<Monument> monuments;
	
	public Celebrite() {
		super();
	}

	public Celebrite(Integer numCelebrite, String nom, String prenom, String nationalite, String epoque) {
		
		this.numCelebrite = numCelebrite;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
	
	}

	public Integer getNumCelebrite() {
		return numCelebrite;
	}


	public void setNumCelebrite(Integer numCelebrite) {
		this.numCelebrite = numCelebrite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public String getEpoque() {
		return epoque;
	}


	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}
	
	
	
}
	