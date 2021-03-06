package pt.adrianz.helloservlet.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static final String INPUT_VIEW 		= "forms/form.jsp";
	private static final String DISPLAY_VIEW 	= "forms/formDisplay.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("inputIndex", 0);


		// returns a session but you cant tell if it is a new session
		// unless you ask the session (session.isNew)
		HttpSession session = request.getSession();

		if ( session.getAttribute("inputIndex") == null ) { session.setAttribute("inputIndex", 0); }

		RequestDispatcher view = request.getRequestDispatcher(FormServlet.INPUT_VIEW);
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String buttonValue = request.getParameter("submitButton");
		
		if ( buttonValue.equals("GO")) {
			procForm01(request, response);
		}
		
		if ( buttonValue.equals("Dynamic")) {
			this.createDynamicForm(request, response);
		}

		if ( buttonValue.equals("Reset")) {
			request.getSession().removeAttribute("inputIndex");
			this.doGet(request, response);
		}
	}
	
	private void createDynamicForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		if ( session.getAttribute("inputIndex") == null ) { session.setAttribute("inputIndex", 0); }
		
		int inputIndex = (int)session.getAttribute("inputIndex");
		inputIndex++;

		//request.setAttribute("inputIndex", inputIndex);
		session.setAttribute("inputIndex", inputIndex);

		RequestDispatcher view = request.getRequestDispatcher(FormServlet.INPUT_VIEW);
		view.forward(request, response);
	}
	
	private void procForm01(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute( "name" , request.getParameter("name") );
		request.setAttribute( "pass" , request.getParameter("pass") );
		request.setAttribute( "mail" , request.getParameter("mail") );
		request.setAttribute( "country" , request.getParameter("country") );
		
		Enumeration<String> parameterNames = request.getParameterNames();
		ArrayList<String> allParameterNames = Collections.list(parameterNames);
		ArrayList<String> allParameterValues = new ArrayList<String>();

		Map<String,String[]> allParameterMap = request.getParameterMap();
		
		while ( parameterNames.hasMoreElements() ) {
			allParameterValues.add(parameterNames.nextElement());
		}
		
		request.setAttribute("allParameterNames", allParameterNames);
		request.setAttribute("allParameterValues", allParameterValues);
		request.setAttribute("allParameterMap", allParameterMap);

		RequestDispatcher dispatcher = request.getRequestDispatcher(FormServlet.DISPLAY_VIEW);
		dispatcher.forward(request, response);
	}

}
