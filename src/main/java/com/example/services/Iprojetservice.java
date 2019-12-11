package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Celebrite;
import com.example.entity.Departement;
import com.example.entity.Lieu;
import com.example.entity.Monument;
@Service 
public interface Iprojetservice {

	public List<Celebrite>getCelebrite();
	public Celebrite addCelebrite(Celebrite celebrite);
	public void deleteCelebrite(Integer numCelebrite );
	public void editCelebrite(Celebrite celebrite);
	public Celebrite getCelebrite(int numCelebrite);
	
	
	
	public List<Monument> getListMonuments();
	public List<Monument> getListMonumentsByLieu();
	public Monument addMonument(Monument m);
	public void addMonumentToLieu(Long codeM, String codeInsee);
	public void deleteMonument(String codeM);
	public Monument consulterMonument(String nomM);
	/*
	/*
      ///////////////////////////LIEUX //// ///////////
    public List<Lieu> getListLieux();
	public Lieu addLieu(Lieu l);
	
	////////////////////////////MONUMENTS/////////////////
	 
	
	
	//////////////////////////DEPARTEMENTS ///////////////
	public List<Departement> getListDepartements();
	public Departement addDepartement(Departement d);
	public Departement getDepartement(String numDep);
	public void deleteLieu(String codeInsee);
	
	public float getDistanceBetweenMonuments(String nomMonA,String nomMonB);

	*/
	
	 
}
	
	
	

		
