package com.gestioncontact.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "adresses")
@Access(AccessType.FIELD)
@SuppressWarnings("serial")
public class Adresse implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pk")
	private long id;
	private String rue;
	@Column(name = "code_postal")
	private String codePostal;
	private String ville;
	private String pays;
	@ManyToMany
	@JoinTable(
			name = "contacts_adresses",
			joinColumns = @JoinColumn(name = "fk_personne"),
			inverseJoinColumns = @JoinColumn(name = "fk_adresse"))
	private Set<Personne> lstPersonnes = new HashSet<Personne>();
	
	
	
	public Adresse() {}

	public Adresse(String rue, String codePostal, String ville, String pays) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public long getId() {
		return id;
	}
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodePostale() {
		return codePostal;
	}
	public void setCodePostale(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", pays="
				+ pays + "]";
	}

	

}
