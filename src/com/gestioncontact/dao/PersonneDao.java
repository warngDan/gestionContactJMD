package com.gestioncontact.dao;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestioncontact.model.Personne;


@Singleton
public class PersonneDao {
	
	@PersistenceContext(name = "personnes")
	private EntityManager em;
	
	
	public Personne getPersonById(long id) {
		System.out.println("Appel DAO");
		return em.find(Personne.class, id);
	}
	
	public void savePerson(Personne person) {
		 em.persist(person);
	}
	 
	public void updatePerson(Personne person ) {
		em.merge(person);
	}
	
	public void deletePerson(Personne person) {
		em.remove(person);
	}
}
