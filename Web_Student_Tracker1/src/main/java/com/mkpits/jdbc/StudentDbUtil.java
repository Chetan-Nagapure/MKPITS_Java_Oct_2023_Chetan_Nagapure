package com.mkpits.jdbc;

import java.rmi.ServerException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	private DataSource dataSource;

	public StudentDbUtil(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		// get connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			myConn = dataSource.getConnection();
			// create a sql statement
			String sql = "select * from student order by last_name";
			myStmt = myConn.createStatement();
			// execute sql query
			myRs = myStmt.executeQuery(sql);
			// process the result set

			while (myRs.next()) {
				// retrive data from result set
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				//create student object
				
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				//add it to the list of student
				students.add(tempStudent);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//close jdbc connection
			close(myConn,myStmt,myRs);
		}
		return students;
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if(myRs !=null) {
				myRs.close();
			}
			if(myStmt !=null) {
				myRs.close();
			}
			if(myConn !=null) {
				myRs.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
