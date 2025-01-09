package com.learn.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertdataIntoMysql {
	public static void main(String []arg) throws SQLException {
	
	
	String url="jdbc:mysql://localhost:3306/learn";
	String uname="root";
	String pass="Elham$$123";
	
	String query="INSERT INTO studentt (id,namess) VALUES (?,?)";
	
	
	int id=12;
	String name="EE";
	
	
	 Connection conn=DriverManager.getConnection(url,uname,pass);
	 PreparedStatement stt=conn. prepareStatement(query);
	 stt.setInt(1,id);
	 stt.setString(2,name);
	 int nm=stt.executeUpdate();
	 
	 System.out.println("nm of rows inserted"+nm);
	}
	
		
}





