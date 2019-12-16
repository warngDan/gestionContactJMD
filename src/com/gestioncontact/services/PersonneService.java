package com.gestioncontact.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Singleton;


import com.gestioncontact.dao.PersonneDao;
import com.gestioncontact.model.Personne;


/**
 * 
 * Cette classe "PersonneService" sert d'interm�diaire entre la servlet et la persistence pour transf�rer toutes les requ�tes utilisateurs telles que :
 * -cr�er, supprimer, actualiser, rechercher un contact...
 * 
 *  @author Daniel & Jean-Michel 
 *  
 */

@Singleton
public class PersonneService {
	
	//attributs
	@EJB private PersonneDao dao;
	
	
	/**
	 * Cette m�thode permet de rechercher une personne par son id.
	 * Elle fait appel � la couche persistance pour transferer/traduire sa requ�te � la base de donn�e.
	 * @param parametre de type long faisant r�f�rence � l'id de la personne.
	 * @return elle retourne l'objet personne stock� dans la base de donn�e sous cet id.
	 */
	public Personne getPersonById(long id) {
		
		return dao.getPersonById(id);
	}
	
	/**
	 * Cette m�thode permet d'afficher la liste des personnes contenue dans la base de donn�e.
	 * Elle fait appel � la couche persistance pour transferer/traduire sa requ�te � la base de donn�e.
	 * @return elle retourne les personnes sous forme de liste.
	 */
	public List<Personne> getAllPerson() {
		return dao.getAllPerson();
	}
	
	/**
	 * Cette m�thode permet d'enregitrer une personne.
	 * Elle fait appel � la couche persistance pour transferer/traduire sa requ�te � la base de donn�e.
	 * @param prend en param�tre un objet de type Personne.
	 * 
	 */
	public void saveNewPerson(Personne person) {
		dao.savePerson(person);
	}

	/**
	 * Cette m�thode permet de supprimer un client par son id.
	 * Elle fait appel � la couche persistance pour transferer/traduire sa requ�te � la base de donn�e.
	 * @param parametre de type long faisant r�f�rence � l'id de la personne.
	 */
	public void deletePerson(long id) {
		dao.deletePerson(id);
	}
	
	/**
	 * Cette m�thode permet de modifier les informations d'une personne.
	 * Elle fait appel � la couche persistance pour transferer/traduire sa requ�te � la base de donn�e.
	 * @param les parametres pour la modification de son profil.
	 */
	public void updatePerson (long id, String nom, String prenom ) {
		Personne personne = dao.getPersonById(id);
		personne.setNom(nom);
		personne.setPrenom(prenom);
				
		dao.updatePerson(personne);
	}
}
