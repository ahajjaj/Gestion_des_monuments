package com.example.Dao;
import java.util.List;
import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Celebrite;
import com.example.entity.Departement;
import com.example.entity.Lieu;
import com.example.entity.Monument;
@Repository
@Transactional
public class ProjetDaoImpl implements IprojetDao{
	
	@Autowired
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Celebrite>getCelebrite() {
		Query req = entityManager.createQuery("select c from Celebrite c  ");
		return req.getResultList();
	}
	
	@Override
	public Celebrite addCelebrite(Celebrite celebrite) {
		entityManager.persist(celebrite );
		return celebrite;
	}
	@Override
	public void deleteCelebrite(Integer numCelebrite) {
		// TODO Auto-generated method stub
		Celebrite celebrite = entityManager.find(Celebrite.class, numCelebrite);
		entityManager.remove(celebrite);
	}

	@Override
	public void editCelebrite(Celebrite celebrite) {
		
		entityManager.merge(celebrite);	
	}

	@Override
	public Celebrite getCelebrite(int numCelebrite) {
		Celebrite celebrite= entityManager.find(Celebrite.class, numCelebrite);
		return celebrite;
	}

	@Override
	public List<Monument> getListMonuments() {
		Query req = entityManager.createQuery("select m from Monument m  ");
		return req.getResultList();
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
		Monument monument = entityManager.find(Monument.class, codeM);
		entityManager.remove(monument);
	
	}
	
	
	@Override
	public Monument consulterMonument(String nomM) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void editM(Monument monument) {
		
		entityManager.merge(monument);	
	}


	}
	
	/*
	@Override
	public Lieu addLieu(Lieu l) {
		em.persist(l);		
		return l;
	}

	@Override
	public Departement addDepartement(Departement d) {
		em.persist(d);
		return d;
	}

	@Override
	public Monument addMonument(Monument m) {
		em.persist(m);
		return m;
	}


	@Override
	public void addMonumentToLieu(Long codeM, String codeInsee) {
		Monument m = em.find(Monument.class, codeM);
		Lieu l = em.find(Lieu.class, codeInsee);
		l.getMonuments().add(m);
	}

	@Override
	public float getDistanceBetweenMonuments(String nomMonA, String nomMonB) {
		float distance = 0;
		Monument m1 = em.find(Monument.class, nomMonA);
		Monument m2 = em.find(Monument.class, nomMonA);

		return distance;
	}

	@Override
	public List<Monument> getListMonumentsByDep(String nomDep) {
		Query req = em.createQuery("select m from Lieu m where m.lieu.dep =:x");
		req.setParameter("x", nomDep);
		
		return req.getResultList();
	}

	@Override
	public List<Monument> getListMonumentsByLieu(String nomCom) {
		// il y a em.findAll...
		Query req = em.createQuery("select m from Lieu m where m.lieu.nomCom =:x");
		req.setParameter("x", nomCom);

		return req.getResultList();
	}

	@Override
	public Departement getDepartement(String numDep) {
		Departement d = em.find(Departement.class, numDep);
		return d;
	}

	public List<Departement> getListDepartements() {
		Query req = em.createQuery("select d from Departement d"); // JPQL
		return req.getResultList();
	}

	@Override
	public List<Lieu> getListLieux() {
		Query req = em.createQuery("select l from Lieu l");
		return req.getResultList();
	}

	@Override
	public void deleteLieu(String codeInsee) {
		Lieu l = em.find(Lieu.class, codeInsee);
		em.remove(l);
	}

	

}
	*/
