package com.learn.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDataFromDatabase {
	public static void main(String []arg) throws SQLException {
		String url="jdbc:mysql://localhost:3306/learn";
		String uname="root";
		String pass="Elham$$123";
		
		String query="select * from studentt";
		
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("namess");
			System.out.println("name:"+name+"id:"+id);
			
		}
	}
	
	

}

