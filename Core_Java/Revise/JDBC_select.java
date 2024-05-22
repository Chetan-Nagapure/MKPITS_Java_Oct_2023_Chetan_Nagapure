package com.mkpits.Revise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_select {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=
					DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
					
			        Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery("select * from student_data");
					while(rs.next())
					System.out.println("Name:"+rs.getString(1) + " " + "City:"+rs.getString(2) + " " + "State:"+rs.getString(3));
					conn.close();
					
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
