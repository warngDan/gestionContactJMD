package com.gestioncontact.presentation;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestioncontact.services.PersonneService;

/**
 * Servlet implementation class ServletSup
 */
@WebServlet("/ServletSup")
public class ServletSup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private PersonneService service;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSup() {
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
		String id = request.getParameter("id");
		long newId=Long.parseLong(id);
		
		service.deletePerson(newId);
	
	}

}
