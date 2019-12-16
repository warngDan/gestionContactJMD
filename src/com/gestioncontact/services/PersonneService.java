package com.gestioncontact.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;


import com.gestioncontact.dao.PersonneDao;
import com.gestioncontact.model.Personne;


/**
 * 
 * Cette classe "PersonneService" sert d'intermédiaire entre la servlet et la persistence pour transférer toutes les requêtes utilisateurs telles que :
 * -créer, supprimer, actualiser, rechercher un contact...
 * 
 *  @author Daniel & Jean-Michel 
 *  
 */

@Singleton
public class PersonneService {
	
	//attributs
	@EJB private PersonneDao dao;
	
	
	/**
	 * Cette méthode permet de rechercher une personne par son id.
	 * Elle fait appel à la couche persistance pour transferer/traduire sa requête à la base de donnée.
	 * @param parametre de type long faisant référence à l'id de la personne.
	 * @return elle retourne l'objet personne stocké dans la base de donnée sous cet id.
	 */
	public Personne getPersonById(long id) {
		
		return dao.getPersonById(id);
	}
	
	/**
	 * Cette méthode permet d'afficher la liste des personnes contenue dans la base de donnée.
	 * Elle fait appel à la couche persistance pour transferer/traduire sa requête à la base de donnée.
	 * @return elle retourne les personnes sous forme de liste.
	 */
	public List<Personne> getAllPerson() {
		return dao.getAllPerson();
	}
	
	/**
	 * Cette méthode permet d'enregitrer une personne.
	 * Elle fait appel à la couche persistance pour transferer/traduire sa requête à la base de donnée.
	 * @param prend en paramètre un objet de type Personne.
	 * 
	 */
	public void saveNewPerson(Personne person) {
		dao.savePerson(person);
	}

	/**
	 * Cette méthode permet de supprimer un client par son id.
	 * Elle fait appel à la couche persistance pour transferer/traduire sa requête à la base de donnée.
	 * @param parametre de type long faisant référence à l'id de la personne.
	 */
	public void deletePerson(long id) {
		dao.deletePerson(id);
	}
	
	/**
	 * Cette méthode permet de modifier les informations d'une personne.
	 * Elle fait appel à la couche persistance pour transferer/traduire sa requête à la base de donnée.
	 * @param les parametres pour la modification de son profil.
	 */
	public void updatePerson (long id, String nom, String prenom ) {
		Personne personne = dao.getPersonById(id);
		personne.setNom(nom);
		personne.setPrenom(prenom);
				
		dao.updatePerson(personne);
	}
}
