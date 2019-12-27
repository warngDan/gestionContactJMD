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
 * Servlet implementation class homeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	
	@EJB
	private PersonneService service;
	
	private static final long serialVersionUID = 1L;
	private static final String CREATE_VIEW = "/newContact.jsp";
	private static final String SEARCH_VIEW = "/searchContact.jsp";
	private static final String ALL_VIEW = "/viewAllContact.jsp";
	private static String selectViewer = "/index.jsp";

	private List<Personne> listContact;
       

   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String check = request.getParameter("check");

		request.setAttribute("check", check);
		
		if (check.equals("create")) {
			selectViewer = CREATE_VIEW;
		}  else if (check.equals("search")) {
			selectViewer = SEARCH_VIEW;
		}else if (check.equals("view")) {
			selectViewer = ALL_VIEW;

			listContact = service.getAllPerson();
			request.setAttribute("listContact", listContact);
		}
		
		this.getServletContext().getRequestDispatcher(selectViewer).forward(request, response);
	}
	

}
