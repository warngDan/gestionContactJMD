package com.gestioncontact.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "personnes")
@Access(AccessType.FIELD)
public class Personne implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk")
	private long pk;
	//private String civilite;
	private String civilite;
	private String nom;
	private String prenom;
//	@ManyToMany
//	private List<Adresse> lstAdresses = new ArrayList<Adresse>();
	
	public Personne() {}
	
	public Personne(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}
	public long getId() {
		return pk;
	}
	public void setId(long id) {
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
//		return lstAdresses;
//	}



	@Override
	public String toString() {
		return "Personne [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
