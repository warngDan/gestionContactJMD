package com.gestioncontact.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestioncontact.model.Personne;


@Singleton
public class PersonneDao {
	
	@PersistenceContext(name = "gestionContactJMD")
	private EntityManager em;
	
	
	public Personne getPersonById(long id) {
		return em.find(Personne.class, id);
	}

	public List<Personne> getAllPerson() {
		
		return em.createNamedQuery("Personne.findAllPersonne", Personne.class)
				.getResultList();
	}
	
	public void savePerson(Personne person) {
		 em.persist(person);
	}
	 
	public void updatePerson(Personne person ) {
		
		em.merge(person);
		
	}
	
	public void deletePerson(long id) {
		
		em.remove(em.find(Personne.class, id));
	}

  

	
	
}
