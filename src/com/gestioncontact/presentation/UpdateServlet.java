package com.gestioncontact.presentation;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestioncontact.model.Personne;
import com.gestioncontact.services.PersonneService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	
	@EJB
	private PersonneService service;
	
	private static final String VIEW = "/updateContact.jsp";
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
    }

	/**
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("checkup");
		
		long idActual = Long.parseLong(id);
	
		Personne p= service.getPersonById(idActual);
		
		request.setAttribute("p", p);
		
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
		
	}

}
