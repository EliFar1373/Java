package com.leran;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Project2Servlet1Requestdis extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int nm3=Integer.parseInt(req.getParameter("num3"));
		int nm4=Integer.parseInt(req.getParameter("num4"));
		int k=nm3+nm4;
		
		
		req.setAttribute("sum", k);
		
		RequestDispatcher rd=req.getRequestDispatcher("view");
	
		rd.forward(req, res);
		System.out.println(k);
		
		
		
	}

}
