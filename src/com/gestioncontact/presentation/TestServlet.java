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
import java.util.List;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	private String VUE= "/WEB-INF/index.jsp";
	private static final long serialVersionUID = 1L;
	
	@EJB
	private PersonneService service;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			
		// Test getPersonById()
		
		//Personne p0 = service.getPersonById(1);
		//request.setAttribute("p0", p0);
		
		
		// Test saveNewPerson() et getPersonByName();
		
		Personne p1 = new Personne("Mr", "CESAIRE", "Daniel");
	
		service.saveNewPerson(p1);
		request.setAttribute("p1", p1);
		
	
		
		List<Personne> p1sav = service.getAllPerson();
		request.setAttribute("p1sav", p1sav);
		
		//service.deletePerson(66);
		//service.updatePerson(67, "CESAIRE", "Jean");
		
//		String message = "Hello";
//		request.setAttribute("coucou", message);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
