package com.greenland.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class MyServlet extends HttpServlet {

	public void doPost (final HttpServletRequest request,
		final HttpServletResponse response) throws
			IOException, ServletException {

				processTheRequest(request, response);
			}

	public void doGet (final HttpServletRequest request,
		final HttpServletResponse response) throws
			IOException, ServletException {

				processTheRequest(request, response);
			}

	public void processTheRequest (final HttpServletRequest request,
		final HttpServletResponse response) throws
			IOException, ServletException {

		final RequestDispatcher view = request.getRequestDispatcher("home.jsp");
		view.forward(request, response);
	}

}