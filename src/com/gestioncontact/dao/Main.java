package com.gestioncontact.dao;

import com.gestioncontact.*;
import com.gestioncontact.model.Personne;
import com.gestioncontact.services.*;


public class Main {
	
	

	public static void main(String[] args) {
		
		PersonneService service = new PersonneService();
		Personne p1 = new Personne();
		
		p1 = service.getPersonById(1);
		
		

	}

}
