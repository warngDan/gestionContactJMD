package com.gestioncontact.services;

import javax.ejb.EJB;
import javax.ejb.Singleton;

import com.formation.annuaire.entities.Personne;
import com.gestioncontact.dao.PersonneDao;

@Singleton
public class PersonneService {
	
	@EJB private PersonneDao dao;
	
	
	public Personne getPersonById(long id) {
		return dao.getPersonById(id);
	}
	
	

}
