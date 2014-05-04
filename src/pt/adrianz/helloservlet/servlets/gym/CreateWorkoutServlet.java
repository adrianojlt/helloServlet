package pt.adrianz.helloservlet.servlets.gym;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GymDispatchServlet
 */
//@WebServlet("/GymDispatchServlet")
public class CreateWorkoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateWorkoutServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher view = request.getRequestDispatcher("gym/insertWorkoutBootstrap.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String musclegroupID = request.getParameter( "musclegroup" );
		String exerciceID = request.getParameter( "exercice" );
		//String reps = request.getParameter( "reps" );
		String[] reps = request.getParameterValues("reps");
		
		if ( request.getParameter("submitButton").equals("Cancel") ) { 
			this.doGet(request, response); 
		}
		
		
	}

}
