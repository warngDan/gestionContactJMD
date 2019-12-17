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
 * Servlet implementation class ServletSup
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String VIEW = "/resultSearchDelete.jsp";
       
	@EJB
	private PersonneService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
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
		String nom = request.getParameter("nomContact").trim();
		String prenom = request.getParameter("prenomContact").trim();
		
		List<Personne> lstContacts = service.getPersonByName(nom, prenom);
		
		
		
		request.setAttribute("lstContacts", lstContacts);
		
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
	
	}

}
