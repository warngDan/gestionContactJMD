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
 * Servlet implementation class ServletCreate
 */
@WebServlet("/ServletCreate")
public class ServletCreate extends HttpServlet {
	
	@EJB
	private PersonneService service;
	
	private static final String MESSAGE_ERREUR= "";
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String civilite = request.getParameter("civilite").trim();
		String nom = request.getParameter("nom").trim();
		String prenom = request.getParameter("prenom").trim();
		
		String rue = request.getParameter("rue");
		String cp = request.getParameter("cp").trim();
		String ville = request.getParameter("ville").trim();
		String pays = request.getParameter("pays").trim();
		
		Adresse a = new Adresse();
		Personne p = new Personne(civilite, nom ,prenom );
		if((rue.isEmpty())||(cp.isEmpty())||(ville.isEmpty())||(pays.isEmpty())) {
			
			;
			
		}else {
			a.setRue(rue);
			a.setCodePostale(cp);
			a.setVille(ville);
			a.setPays(pays);
			p.setAdresse(a);
		}
		
		service.saveNewPerson(p);
		
	}

	

}
