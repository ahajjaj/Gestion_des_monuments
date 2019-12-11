package com.example.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Dao.IprojetDao;
import com.example.entity.Celebrite;
import com.example.entity.Departement;
import com.example.entity.Lieu;
import com.example.entity.Monument;
@Transactional

public class ProjetServiceImpl  implements Iprojetservice{
	@Autowired
	private IprojetDao dao;
	
	public void setDao(IprojetDao dao) {
		this.dao= dao;
	}
	
	@Override
	public  List<Celebrite>getCelebrite() {
		return dao.getCelebrite();
	}

	@Override
	public Celebrite addCelebrite(Celebrite celebrite) {
		// TODO Auto-generated method stub
		return celebrite;
	}

	@Override
	public void deleteCelebrite(Integer numCelebrite) {
		// TODO Auto-generated method stub
		dao.deleteCelebrite(numCelebrite);
		
		
	}

	@Override
	public void editCelebrite(Celebrite celebrite) {
		// TODO Auto-generated method stub
		dao.editCelebrite(celebrite);
		
	}
	@Override
	public Celebrite getCelebrite(int numCelebrite) {
		
		return dao.getCelebrite(numCelebrite);
	}

	@Override
	public List<Monument> getListMonuments() {
		
		return dao.getListMonuments();
	}

	@Override
	public List<Monument> getListMonumentsByLieu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Monument addMonument(Monument m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMonumentToLieu(Long codeM, String codeInsee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMonument(String codeM) {
		// TODO Auto-generated method stub
		dao.deleteMonument(codeM);
	}

	@Override
	public Monument consulterMonument(String nomM) {
		// TODO Auto-generated method stub
		return null;
	}
	

/*
	@Override
	public Monument deleteMonument(Long id) {
		return dao.deleteMonument(id);
	}

	@Override
	public Monument consulterMonument(String nomM) {
		return dao.consulterMonument(nomM);
	}
	
	@Override
	public Monument addMonument(Monument m) {
		return dao.addMonument(m);
	}
	

/*
private IprojetDao dao;
	
	public void setDao(IprojetDao dao) {
		this.dao= dao;
	}

	@Override
	public Monument deleteMonument(Long id) {
		return dao.deleteMonument(id);
	}

	@Override
	public Monument consulterMonument(String nomM) {
		return dao.consulterMonument(nomM);
	}


	@Override
	public Lieu addLieu(Lieu l) {
		
		//return dao.addLieu(l);
		return null;
	}

	@Override
	public Departement addDepartement(Departement d) {
		return null;//return dao.addDepartement(d);
	}

	@Override
	public Monument addMonument(Monument m) {
		return dao.addMonument(m);
	}

	@Override
	public Celebrite addCelebrite(Celebrite c) {
		// TODO Auto-generated method stub
		return null;//return dao.addCelebrite(c);
	}

	@Override
	public void addMonumentToLieu(Long codeM, String codeInsee) {
		//dao.addMonumentToLieu(codeM, codeInsee);
	}

	@Override
	public float getDistanceBetweenMonuments(String nomMonA, String nomMonB) {

		return 12;//return dao.getDistanceBetweenMonuments(nomMonA, nomMonB);
	}

	@Override
	public List<Monument> getListMonumentsByDep(String nomDep) {
		
		
		return null;////return dao.getListMonumentsByDep(nomDep);
	}

	@Override
	public List<Monument> getListMonumentsByLieu(String nomCom) {
		return null;//return dao.getListMonumentsByLieu(nomCom);
	}

	@Override
	public Departement getDepartement(String numDep) {
		return null;//return dao.getDepartement(numDep);
	}


	@Override
	public List<Departement> getListDepartements() {
		// TODO Auto-generated method stub
		return null;//return dao.getListDepartements();
	}

	@Override
	public List<Lieu> getListLieux() {
		// TODO Auto-generated method stub
		return null;//return dao.getListLieux();
	}

	@Override
	public void deleteLieu(String codeInsee) {
		//dao.deleteLieu(codeInsee);
	}

*/

	}