package com.leran;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/view")
public class Project2Servlet1View extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int m=(int) req.getAttribute("sum");
		int result=m*m;
		 
		
	    HttpSession session=req.getSession();
	    session.setAttribute("result",result);
	
	    res.sendRedirect("View.jsp");
		
	}
	

}
