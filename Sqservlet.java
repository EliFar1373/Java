package com.learn;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sq")
public class Sqservlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
		
//		first approach requet dispatcher 
//		int k=(int)req.getAttribute("k");
		
		
//		secodn apprach sebdRedirect
//      int k =Integer.parseInt(req.getParameter("k"));
        
		
//		thirrd approach using session and onject needs to be turn to int
		HttpSession session=req.getSession();
		int k=(int) session.getAttribute("k");
		
		
        
        
		k=k*k;
//		
		PrintWriter out=res.getWriter();
		out.println("result is "+k);
		
		System.out.println("hello");
	}

}
