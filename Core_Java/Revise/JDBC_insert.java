package com.mkpits.Revise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_insert {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
					
			       // PreparedStatement stmt = (PreparedStatement) conn.createStatement();
					//ResultSet rs = stmt.executeQuery("insert into student_data values (?,?,?)");
			PreparedStatement stmt = conn.prepareStatement("insert into student_data values(?,?,?),(?,?,?)");		
			        stmt.setString(1, "vinay");
					stmt.setString(2,"Nagpur");
					stmt.setString(3, "Maharashtra");
					
					stmt.setString(4, "regved");
					stmt.setString(5, "Nagpur");
					stmt.setString(6,"Maharashtra");
					//while(rs.next())
					
					int i= stmt.executeUpdate();
					System.out.println(i+ "records inserted");
					conn.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}



	}

}
