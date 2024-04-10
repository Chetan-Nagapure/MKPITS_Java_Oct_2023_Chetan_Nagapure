package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */
@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set content type
		response.setContentType("text/html");
		//get Printer
		PrintWriter out=response.getWriter();
		//read configuration param(Parameter)
		ServletContext context=getServletContext();
		String maxCartsize=context.getInitParameter("max-shopping-card-size");
		String teamName=context.getInitParameter("project-team-name");
		
		out.println("<html><body>");
		out.println("<h2>Maximun Size of cart</h2>"+maxCartsize);
		out.println("<hr>");
		out.println("Team Name is "+teamName);
		out.println("</body></html>");
	}

}
