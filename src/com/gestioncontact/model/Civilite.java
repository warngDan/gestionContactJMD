package com.gestioncontact.model;

public enum Civilite {
	
		  Mr ("Monsieur"),
		  Mme ("Madame"),
		  Mlle ("Mademoiselle");

		   
		  private String name = "";
		   
		  //Constructeur
		  Civilite(String name){
		    this.name = name;
		  }
		   
		  public String toString(){
		    return name;
		  }

}
