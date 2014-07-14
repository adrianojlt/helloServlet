package pt.adrianz.helloservlet.servlets;

import java.io.IOException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import pt.adrianz.helloservlet.beans.Employee;
import pt.adrianz.helloservlet.dao.EmployeeDAO;

/**
 * Servlet implementation class PaginationServlet
 */
@WebServlet("/PaginationServlet")
public class PaginationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private DataSource pool; // Database connection pool
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaginationServlet() {
        super();
    }
    
    @Override
    public void init() throws ServletException{
    	
    	try {
    		
    		// create a JNDI initial context to be able to lookup the DataSource
    		InitialContext ctx = new InitialContext();

    		pool = (DataSource)ctx.lookup("java:comp/env/jdbc/testDB");
    		if ( pool == null) throw new ServletException("unknown datasource");
    	}
    	catch (NamingException namingEx) {
    		namingEx.printStackTrace();
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int page = 1;
		int recordsPerPage = 5;
		
		if ( request.getParameter("page") != null )
			page = Integer.parseInt(request.getParameter("page"));
		
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> list = dao.viewAllEmployees( (page-1)*recordsPerPage , recordsPerPage );
		
		int noOfRecords = dao.getNoOfRecords();
		int noOfPages = (int)Math.ceil(noOfRecords*1.0 / recordsPerPage);
		request.setAttribute("employeeList", list);
		request.setAttribute("noOfPages", noOfPages);
		request.setAttribute("currentPage", page);

		RequestDispatcher view = request.getRequestDispatcher("pagination.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
