package com.learn;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


// send data to second servlet
@WebServlet("/add")
public class Addservlet extends HttpServlet {
	
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
//		we have string and we need to turn it to int use parseInt method
		int i= Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		
//		
		
		
		
//		First apparoch
//	send data to secodn servlet 
//	    req.setAttribute("k", k);
//		System.out.println("result is"+k);
//		conncet to servlet, req and res object is send to the second servlet 
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		
		
		
//		second approach, this servelet will respond to client ad say create a url with sq
		
//		res.sendRedirect("sq?k="+k);
//		res.sendRedirect("sq"); chcek if you see in url you  go to 
		
		
		
//		third approach use session to send
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		
		res.sendRedirect("sq");
		
		
		
	}
}






// class to print result in page
//public class Addservlet extends HttpServlet {
//	
////	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
//	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
//	{
//		int i= Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int k=i+j;
//	
//	
//		System.out.println("result is"+k);
//		PrintWriter out=res.getWriter();
//		out.println("result is"+k);
//		
//	}
//	
//	
//	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
//	{
//		int i= Integer.parseInt(req.getParameter("num1"));
//		int j=Integer.parseInt(req.getParameter("num2"));
//		int k=i+j;
//		System.out.println("result is"+k);
//		PrintWriter out=res.getWriter();
//		out.println("result is"+k);
//		
//	}
//	
//	
//
//}
