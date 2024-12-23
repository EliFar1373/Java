package com.leran;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet  extends HttpServlet {
	
	 @Override
		public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
		{
			
			int nm1=Integer.parseInt(req.getParameter("num1"));

			int nm2=Integer.parseInt(req.getParameter("num2"));
			
			int sum=nm1+nm2;
			System.out.println(sum);
			
			PrintWriter out=res.getWriter();
			out.println(sum);
			
			
		}

}











