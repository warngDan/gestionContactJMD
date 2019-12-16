package com.gestioncontact.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;


import com.gestioncontact.dao.PersonneDao;
import com.gestioncontact.model.Personne;

@Singleton
public class PersonneService {
	
	@EJB private PersonneDao dao;
	
	
	public Personne getPersonById(long id) {
		//System.out.println("Appel Service");
		return dao.getPersonById(id);
	}
	
	public List<Personne> getAllPerson() {
		return dao.getAllPerson();
	}
	
	public void saveNewPerson(Personne person) {
		dao.savePerson(person);
	}

	public void deletePerson(long id) {
		dao.deletePerson(id);
	}
	
	public void updatePerson (long id, String nom, String prenom ) {
		Personne personne = dao.getPersonById(id);
		personne.setNom(nom);
		personne.setPrenom(prenom);
				
		dao.updatePerson(personne);
	}
}
