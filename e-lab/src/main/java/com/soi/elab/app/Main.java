package com.soi.elab.app;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testOrder")
public class Main extends HttpServlet {
	 private static final long serialVersionUID = 1L;

	    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        response.getWriter().write("<h1>Test Order Page</h1>");
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String testType = request.getParameter("testType");
	        // Here you can add logic to save the test order
	        response.setContentType("text/html");
	        response.getWriter().write("<h1>Order Placed for Test Type: " + testType + "</h1>");
	    }
}
