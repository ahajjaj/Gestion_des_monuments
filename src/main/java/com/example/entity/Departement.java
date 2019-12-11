package com.example.entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity // verifie si la classe existe ds la bb ! si nn il va la créée 
public class Departement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private String dep; 
	private String chefLieu;
	private String nomDep;
	private String reg;
	
	@OneToMany(mappedBy = "dep")
	private List<Lieu> lieu ;

	
	
	public Departement() {
		super();
	}


	public Departement(String dep, String chefLieu, String nomDep, String reg) {
		super();
		this.dep = dep;
		this.chefLieu = chefLieu;
		this.nomDep = nomDep;
		this.reg = reg;
	}


	public String getDep() {
		return dep;
	}



	public void setDep(String dep) {
		this.dep = dep;
	}



	public String getChefLieu() {
		return chefLieu;
	}



	public void setChefLieu(String chefLieu) {
		this.chefLieu = chefLieu;
	}



	public String getNomDep() {
		return nomDep;
	}



	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}



	public String getReg() {
		return reg;
	}



	public void setReg(String reg) {
		this.reg = reg;
	}
	
	
	
	

}
