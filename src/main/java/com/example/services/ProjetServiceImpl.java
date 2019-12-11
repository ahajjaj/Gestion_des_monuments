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
	

}