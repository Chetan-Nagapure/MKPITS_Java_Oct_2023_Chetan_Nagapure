package com.mkpits.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCServletDemoTwo
 */
@WebServlet("/MVCServletDemoTwo")
public class MVCServletDemoTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MVCServletDemoTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get data from Student helper class
		List<Student> students=StudentDataUtil.getStudent();
		//add data to data object
		request.setAttribute("student_list", students);
		//get request dispatcher
		RequestDispatcher dispatcher=request.getRequestDispatcher("/view_student_data.jsp");
		dispatcher.
		
		
	}

}
