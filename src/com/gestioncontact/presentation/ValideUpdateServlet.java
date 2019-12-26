package com.gestioncontact.presentation;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestioncontact.model.Adresse;
import com.gestioncontact.model.Personne;
import com.gestioncontact.services.PersonneService;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/ValideUpdateServlet")
public class ValideUpdateServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PersonneService service;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String civilite = request.getParameter("civilite");
		String nom = request.getParameter("nom").trim();
		String prenom = request.getParameter("prenom").trim();
		
		String rue = request.getParameter("rue");
		String cp = request.getParameter("cp");
		String ville = request.getParameter("ville").trim();
		String pays = request.getParameter("pays").trim();
		Adresse a = new Adresse();
		Personne p = new Personne(civilite, nom ,prenom );
		
		a.setRue(rue);
		a.setCodePostale(cp);
		a.setVille(ville);
		a.setPays(pays);
		p.setAdresse(a);
		
		
		
		service.updatePerson(p);
		
	
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
