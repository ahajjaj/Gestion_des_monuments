package com.example.Dao;

import java.util.List;

import com.example.entity.Celebrite;
import com.example.entity.Departement;
import com.example.entity.Lieu;
import com.example.entity.Monument;

public interface IprojetDao{
	
	//////////////////// CELEBRITES///////////////////////:
	public List<Celebrite>getCelebrite();
	public Celebrite addCelebrite(Celebrite celebrite);
	public void deleteCelebrite(Integer numCelebrite );
	public void editCelebrite(Celebrite celebrite);
	public Celebrite getCelebrite(int numCelebrite);


////////////////////////////MONUMENTS/////////////////

public Monument addMonument(Monument m);
public void addMonumentToLieu(Long codeM, String codeInsee);
public void deleteMonument(String codeM);
public void editM(Monument monument);
public Monument consulterMonument(String nomM);
List<Monument> getListMonuments();

}
	/*
      ///////////////////////////LIEUX //// ///////////
    public List<Lieu> getListLieux();
	public Lieu addLieu(Lieu l);
	
	
	
	//////////////////////////DEPARTEMENTS ///////////////
	public List<Departement> getListDepartements();
	public Departement addDepartement(Departement d);
	public Departement getDepartement(String numDep);
	public void deleteLieu(String codeInsee);
	
	public float getDistanceBetweenMonuments(String nomMonA,String nomMonB);

	*/
	/*
	
	
	
	//public AssocieA addAssociation(AssocieA a);
	
	
	
	
	
	
	
	
	*/
