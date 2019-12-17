package com.gestioncontact.presentation;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestioncontact.model.Personne;
import com.gestioncontact.services.PersonneService;

/**
 * Servlet implementation class SearchContactServlet
 */
@WebServlet("/SearchContactServlet")
public class SearchContactServlet extends HttpServlet {
	
	@EJB
	private PersonneService service;
	private static final long serialVersionUID = 1L;
       
//	private static final String MESSAGE_ERREUR = "";
	private static final String VIEW = "/resultSearch.jsp";
	
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchContactServlet() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nomContact").trim();
		String prenom = request.getParameter("prenomContact").trim();
		
		Personne contact = service.getPersonByName(nom, prenom);
		
		
		
		request.setAttribute("contact", contact);
		
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
		
	}

}
