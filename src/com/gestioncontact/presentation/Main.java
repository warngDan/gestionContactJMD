package com.gestioncontact.presentation;

import javax.ejb.EJB;

import com.gestioncontact.*;
import com.gestioncontact.model.Personne;
import com.gestioncontact.services.*;


public class Main {
	
	@EJB static PersonneService service = new PersonneService();

	public static void main(String[] args) {
		
		
		Personne p1 = new Personne();
		
		p1 = service.getPersonById(1);
		
		System.out.println(p1);

	}

}
