package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServletPost
 */
@WebServlet("/StudentServletPost")
public class StudentServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServletPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set content type
				response.setContentType("text/html");
				//get PrintWriter
				PrintWriter out=response.getWriter();
				//generate html content
				out.println("<html><body>");
				out.println("<h2>Welcome!!</h2>");
				out.println("<hr>");
				out.println("The Student is Confirmed :"+request.getParameter("fName")+" "+request.getParameter("lName"));
				out.println("</body></html>");
	}

}
