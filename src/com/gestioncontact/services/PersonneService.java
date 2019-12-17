package com.gestioncontact.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;


import com.gestioncontact.dao.PersonneDao;
import com.gestioncontact.model.Personne;


/**
 * 
 * Cette classe "PersonneService" sert d'intermédiaire entre la servlet et la persistence pour transférer toutes les requétes utilisateurs telles que :
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
	 * Elle fait appel é la couche persistance pour transferer/traduire sa requéte é la base de donnée.
	 * @param parametre de type long faisant référence é l'id de la personne.
	 * @return elle retourne l'objet personne stocké dans la base de donnée sous cet id.
	 */
	public Personne getPersonById(long id) {
		
		return dao.getPersonById(id);
	}
	
	
	/**
	 * Cette méthode permet de rechercher une personne par son nom et son prénom.
	 * Pour gérer l'éventualité de doublon, une liste est retournée avec toutes les occurences trouvées.
	 * @param nom : Nom du contact recherché
	 * @param prenom : Prénom du contact recherché
	 */
	public List<Personne> getPersonByName(String nom, String prenom) {
		return dao.getPersonneByName(nom, prenom);
		
	}
	
	/**
	 * Cette méthode permet d'afficher la liste des personnes contenue dans la base de donnée.
	 * Elle fait appel é la couche persistance pour transferer/traduire sa requéte é la base de donnée.
	 * @return elle retourne les personnes sous forme de liste.
	 */
	public List<Personne> getAllPerson() {
		return dao.getAllPerson();
	}
	
	/**
	 * Cette méthode permet d'enregitrer une personne.
	 * Elle fait appel é la couche persistance pour transferer/traduire sa requéte é la base de donnée.
	 * @param prend en paramétre un objet de type Personne.
	 * 
	 */
	public void saveNewPerson(Personne person) {
		dao.savePerson(person);
	}

	/**
	 * Cette méthode permet de supprimer un client par son id.
	 * Elle fait appel é la couche persistance pour transferer/traduire sa requéte é la base de donnée.
	 * @param parametre de type long faisant référence é l'id de la personne.
	 */
	public void deletePerson(long id) {
		dao.deletePerson(id);
	}
	
	/**
	 * Cette méthode permet de modifier les informations d'une personne.
	 * Elle fait appel é la couche persistance pour transferer/traduire sa requéte é la base de donnée.
	 * @param les parametres pour la modification de son profil.
	 */
	public void updatePerson (Personne personne ) {
						
		dao.updatePerson(personne);
	
		
	}
}
