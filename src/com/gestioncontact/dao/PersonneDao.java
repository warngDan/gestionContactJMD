package com.gestioncontact.dao;

import java.util.List;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestioncontact.model.Personne;

/**
 * Description:
 * Class PersonneDAO qui int�ragit avec la base de donn�es pour r�aliser op�rations dites "CRUD".
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
	 * M�thode de recherche d'une entit� "Personne" dans la base de donn�es
	 * @param id de type "long" faisant r�f�rence � l'id de la personne
	 * @return renvoi vers l'objet Personne stock� dans la BDD sous cet id
	 */	
	public Personne getPersonById(long id) {
		return em.find(Personne.class, id);
	}
	
	
	public List<Personne> getPersonneByName(String nom, String prenom) {
		List<Personne> listPersons = em.createNamedQuery("Personne.getPersonByName", Personne.class)
				.setParameter("nom", nom).setParameter("prenom", prenom).getResultList();
		if (listPersons.isEmpty()) {
			return null;
		}
		return listPersons;
	}
	
	
	
	/**
	 * M�thode permettant d'afficher la totalit� des personnes de la base de donn�e.
	 */
	public List<Personne> getAllPerson() {
		
		return em.createNamedQuery("Personne.findAllPersonne", Personne.class)
				.getResultList();
	}
	
	/**
	 * M�thode d'enregistrement d'une entit� "Personne" dans la base de donn�es
	 * @param person de type "Personne"
	 */
	public void savePerson(Personne person) {
		 em.persist(person);
	}
	
	/**
	 * M�thode de mise � jour des attributs d'une personne
	 * @param person de type "Personne"
	 */ 
	public void updatePerson(Personne person ) {
		
		em.merge(person);
		
	}
	
	/**
	 * M�thode de suppression d'une entit� "Personne" dans la base de donn�es
	 * @param id de type "long" faisant r�f�rence � l'id de la Personne
	 */
	public void deletePerson(long id) {
		
		em.remove(em.find(Personne.class, id));
	}

  

	
	
}
