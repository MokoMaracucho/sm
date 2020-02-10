package com.sm.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SRV_Accueil extends HttpServlet {

	public static final String VUE_ACCUEIL = "/WEB-INF/jsp_accueil.jsp";

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE_ACCUEIL).forward(request, response);
	}
}