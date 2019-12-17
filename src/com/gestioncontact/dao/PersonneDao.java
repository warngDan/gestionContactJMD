package com.gestioncontact.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestioncontact.model.Personne;

/**
 * Description:
 * Class PersonneDAO qui intéragit avec la base de données pour réaliser opérations dites "CRUD".
 * 
 * @author Jean-Michel & Daniel
 * @version 1.0 
 * 
 */
@Singleton
public class PersonneDao {
	
	//Attributs
	@PersistenceContext(name = "gestionContactJMD")
	private EntityManager em;
	
	
	/**
	 * Méthode de recherche d'une entité "Personne" dans la base de données
	 * @param id de type "long" faisant référence é l'id de la personne
	 * @return renvoi vers l'objet Personne stocké dans la BDD sous cet id
	 */	
	public Personne getPersonById(long id) {
		return em.find(Personne.class, id);
	}
	
	/**
	 * Méthode de recherche d'une entité "Personne" dans la base de données par son Nom et son prénom.
	 * @param Nom du contact recherché
	 * @param Prénonom du contact recherché
	 * @return renvoi vers l'objet Personne stocké dans la BDD sous cet id
	 */	
	public List<Personne> getPersonneByName(String nom, String prenom) {
		List<Personne> listPersons = em.createNamedQuery("Personne.getPersonByName", Personne.class)
				.setParameter("nom", nom).setParameter("prenom", prenom).getResultList();
		if (listPersons.isEmpty()) {
			return null;
		}
		return listPersons;
	}
	
	
	
	/**
	 * Méthode permettant d'afficher la totalité des personnes de la base de donnée.
	 */
	public List<Personne> getAllPerson() {
		
		return em.createNamedQuery("Personne.findAllPersonne", Personne.class)
				.getResultList();
	}
	
	/**
	 * Méthode d'enregistrement d'une entité "Personne" dans la base de données
	 * @param person de type "Personne"
	 */
	public void savePerson(Personne person) {
		 em.persist(person);
	}
	
	/**
	 * Méthode de mise é jour des attributs d'une personne
	 * @param person de type "Personne"
	 */ 
	public void updatePerson(Personne person ) {
		
		em.merge(person);
		
	}
	
	/**
	 * Méthode de suppression d'une entité "Personne" dans la base de données
	 * @param id de type "long" faisant référence é l'id de la Personne
	 */
	public void deletePerson(long id) {
		
		em.remove(em.find(Personne.class, id));
	}

  

	
	
}
