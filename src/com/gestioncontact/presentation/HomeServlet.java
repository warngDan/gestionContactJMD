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
	
	public static final String CREATE_VIEW = "/newContact.jsp";
	public static final String UPDATE_VIEW = "/updateContact.jsp";
	public static final String SEARCH_VIEW = "/searchContact.jsp";
	public static final String DELETE_VIEW = "/deleteContact.jsp";
	public static final String ALL_VIEW = "/viewAllContact.jsp";
	public static String selectViewer = "index.jsp";
	List<Personne> listContact;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().log("GET APPELLEEEEEEE");
//		
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String check = request.getParameter("check");

		request.setAttribute("check", check);
		
		if (check.equals("create")) {
			selectViewer = CREATE_VIEW;
		} else if (check.equals("update")) {
			selectViewer = UPDATE_VIEW;
		} else if (check.equals("search")) {
			selectViewer = SEARCH_VIEW;
		} else if (check.equals("delete")) {
			selectViewer = DELETE_VIEW;
		}else if (check.equals("view")) {
			selectViewer = ALL_VIEW;
			listContact = service.getAllPerson();
			request.setAttribute("listContact", listContact);
		}
		
		
		
		this.getServletContext().getRequestDispatcher(selectViewer).forward(request, response);
	}
	

}
