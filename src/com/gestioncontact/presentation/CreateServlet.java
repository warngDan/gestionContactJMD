package com.gestioncontact.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	
	@EJB
	private PersonneService service;
	private String succesMessage;
	private String errorMessage;
	private static final String redirectView = "/viewAllContact.jsp";
	
	private List<Personne> listContact;
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
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
		
		Adresse adresse = new Adresse();
		Personne personne = new Personne(civilite, nom ,prenom );
		
		if ((rue.isEmpty())||(cp.isEmpty())||(ville.isEmpty())||(pays.isEmpty())) {
				errorMessage = "ATTENTION : Adresse non renseignée.";
		} else {
			adresse.setRue(rue);
			adresse.setCodePostale(cp);
			adresse.setVille(ville);
			adresse.setPays(pays);
			personne.setAdresse(adresse);
		}
		
		service.saveNewPerson(personne);
		listContact = new ArrayList<Personne>();
		listContact.add(personne);
		succesMessage = "Sauvegardé avec succès !";
		
		request.setAttribute("succesMessage", succesMessage);
		request.setAttribute("errorMessage", errorMessage);
		request.setAttribute("listContact", listContact);
		
		this.getServletContext().getRequestDispatcher(redirectView).forward(request, response);
	}

	

}
