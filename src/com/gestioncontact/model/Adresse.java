package com.gestioncontact.model;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**

 * 
 * Description: Classe m�tier permettant d'instancier un objet Adresse.
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
@Table(name = "adresses")
@Access(AccessType.FIELD)
public class Adresse implements Serializable {
	
	//Attributs
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long pk;
	private String rue;
	@Column(name = "code_postal")
	private String codePostal;
	private String ville;
	private String pays;
	

	//Constructeurs
	public Adresse() {}

	public Adresse(String rue, String codePostal, String ville, String pays) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public long getPk() {
		return pk;
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

	//M�thode d'affichage
	@Override
	public String toString() {
		return "Adresse [id=" + pk + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", pays="
				+ pays + "]";
	}

	

}
