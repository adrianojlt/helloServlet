package pt.adrianz.helloservlet.bis.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.adrianz.helloservlet.bis.cp.BisCommand;

public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String commandCP = null;
		String view = null;
		
		commandCP = request.getParameter("ParameterActionCommand");

		if ( commandCP != null ) {

			String commandClass = "pt.adrianz.helloservlet.bis.cp." + commandCP + "CP";

			try {

				 Class myClass = Class.forName(commandClass);
				 BisCommand bisCommand = (BisCommand)myClass.newInstance();
				 view = bisCommand.execute(request, response);
				 
				 if ( view == null || view.trim().equalsIgnoreCase("") ) {
					 view = "BisError";
				 }
				 
				 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/BisHome.jsp?prmDynInclPage=" + view);
				 requestDispatcher.forward(request, response);
			}
			catch (Exception ex) {
				
			}
		}
	}
}
