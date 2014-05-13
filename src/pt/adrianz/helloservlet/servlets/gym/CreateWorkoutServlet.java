package pt.adrianz.helloservlet.servlets.gym;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.adrianz.helloservlet.dao.GymDAO;

/**
 * Servlet implementation class GymDispatchServlet
 */
//@WebServlet("/GymDispatchServlet")
public class CreateWorkoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private GymDAO gymDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateWorkoutServlet() {
        super();
    }
    
    @Override
    public void init() {
    	//this.gymDAO = new GymDAO();
    }
    
    @Override
    public void destroy() {
    	//gymDAO.close();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GymDAO gymDAO = new GymDAO();
		request.setAttribute("exercices", gymDAO.getExercices());
		request.setAttribute("musclegroup", gymDAO.getMuscleGroups());
		gymDAO.close();
		
		RequestDispatcher view = request.getRequestDispatcher("gym/createWorkout.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if ( request.getParameter("submitButton").equals("Cancel") ) { 
			this.doGet(request, response); 
		}
		
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		String musclegroupID = request.getParameter( "musclegroup" );
		String exerciceID = request.getParameter( "exercice" );
		//String reps = request.getParameter( "reps" );
		String[] reps = request.getParameterValues("reps");
		//request.getpara

		out.println("<html>");
		out.println(musclegroupID);
		out.println("<br>");
		out.println(exerciceID);
		out.println("<br>");
		
		for ( String item : reps ) {
			out.println(item);
			out.println(" ; ");
		}
		out.println("</html>");
	}
}
