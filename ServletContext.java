package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class ServletContext extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		
		
		ServletContext ctx= getServletContext();
		String str= ctx.getInitParameter("phone");
		
		PrintWriter out=res.getWriter();
		out.println("<html><body bgcolor='yellow'>");
		out.println(str);
		out.print("</body></html>");
		
		System.out.println(str);
		
		
		
	}
	
	

}



