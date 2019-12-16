package com.gestioncontact.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gestioncontact.model.Adresse;

public class AdresseTest {
	
	Adresse adresse = new Adresse("3 place republique", "75015", "Paris", "France");
	
	@Test
	public void testAdresse() {
		assertNotNull(adresse);
	}


	@Test
	public void testGetVille() {
		assertEquals("Paris", adresse.getVille());
	}

	@Test
	public void testSetVille() {
		adresse.setCodePostale("91000");
		assertEquals("91000", adresse.getCodePostale());
	}



}
