package com.gestioncontact.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * 
 * Description: Classe m�tier permettant d'instancier un objet Personne.
 * Elle contient: 
 * -tous les attributs associ�s
 * -un constructeur
 * -les getters et setters de chaque attribut
 * -une m�thode d'affichage
 * La classe est persist� dans la base de donn�e
 * 
 * @author Daniel & Jean-Michel
 * @version 1.0
 * 
 */

@Entity
@Table(name = "personnes")
@Access(AccessType.FIELD)

@NamedQuery(name = "Personne.findAllPersonne",
			query="SELECT p FROM Personne p")
public class Personne implements Serializable {

	//Attributs
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pk;
	private String civilite;
	private String nom;
	private String prenom;
	
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name="contacts_adresses",
	joinColumns = @JoinColumn(name="fk_adresse"),
	inverseJoinColumns = @JoinColumn(name="fk_personne"))
	private Adresse adresse;
	//private List<Adresse> listAdresse = new ArrayList<>();

	
	//Constructeur
	public Personne() {}
	
	public Personne(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//Getters Setters
	public long getPk() {
		return pk;
	}
	public void setPk(long id) {
		this.pk = id;
	}
	public String getString() {
		return civilite.toString();
	}
	public void setString(String civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

//	public List<Adresse> getLstAdresses() {
//		return listAdresse;
//	}
	public Adresse getAdresse() {
		return adresse;
	}


	//M�thode d'affichage
	@Override
	public String toString() {
		return "Personne [id=" + pk + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ",adresse =" + adresse + "]";
	}


	
}
