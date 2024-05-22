package com.mkpits.Revise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_update {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","");
					
			       // PreparedStatement stmt = (PreparedStatement) conn.createStatement();
					//ResultSet rs = stmt.executeQuery("insert into student_data values (?,?,?)");
			PreparedStatement stmt = conn.prepareStatement("update student_data set Name=? where City=?");		
			        stmt.setString(1, "chetan");
			        stmt.setString(2, "Nagpur");
					
					int i= stmt.executeUpdate();
					System.out.println(i+ "records updated");
					conn.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
