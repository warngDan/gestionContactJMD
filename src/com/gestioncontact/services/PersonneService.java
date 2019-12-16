package com.gestioncontact.services;

import javax.ejb.EJB;
import javax.ejb.Singleton;


import com.gestioncontact.dao.PersonneDao;
import com.gestioncontact.model.Personne;

@Singleton
public class PersonneService {
	
	@EJB private PersonneDao dao;
	
	
	public Personne getPersonById(long id) {
		System.out.println("Appel Service");
		return dao.getPersonById(id);
	}
	
	

}
