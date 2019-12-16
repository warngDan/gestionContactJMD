package com.gestioncontact.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gestioncontact.model.Personne;




public class PersonneTest {
	Personne personne = new Personne("M", "Toto", "tata");
	@Test
	public void testPersonne() {
		
		assertNotNull(personne);
	}

	

	@Test
	public void testGetNom() {
		assertEquals("Toto", personne.getNom());
	}

	@Test
	public void testSetNom() {
		personne.setPrenom("Titi");
		assertEquals("Titi", personne.getPrenom());
	}





}
