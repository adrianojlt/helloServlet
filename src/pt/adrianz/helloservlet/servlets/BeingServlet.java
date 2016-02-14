package pt.adrianz.helloservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import pt.adrianz.helloservlet.beans.Conf;

/**
 * Servlet implementation class TmpServlet
 */
//@WebServlet("/TmpServlet")
public class BeingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeingServlet() {
        super();
        System.out.println("constructor");
    }
    
    @Override
    public void init() {
        System.out.println("init");
    }
    
    @Override
    public void destroy() {
        System.out.println("destroy");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		//response.setContentType("application/jar");
		response.setContentType("text/html");
		response.setHeader("myHeader", "headerValue");
		
		String contextPath = request.getContextPath();
		contextPath = contextPath.substring(1);
		
		String redirect = request.getParameter("redirect");
		
		if ( redirect != null && redirect.equals("ProductServlet")) {
			// redirect must be called before writing to response
			response.sendRedirect( request.getContextPath() + "/product");
		}

		out.println("<html>");
		out.println("<body>");
		out.println("<a href=\"/helloServlet/index.html\">Home</a>");
		out.println("<hr>");
		this.printHello(out);
		out.println("<ul>");
		out.println("<li>"+ request.getHeader("User-Agent") + "</li>");
		out.println("<li>"+ request.getCookies() + "</li>");
		out.println("<li>"+ request.getSession() + "</li>");
		out.println("<li>"+ "Servlet Name: " + this.getServletConfig().getServletName() + "</li>");
		out.println("<li>"+ "ContextPath: " + request.getContextPath() + "</li>");
		//out.println("<li>"+ "ContextPath: " + contextPath + "</li>");
		out.println("<li>"+ request.getLocalName() + "</li>");
		out.println("<li>"+ request.getRequestURL() + "</li>");
		
		// check web.xml to see this parameters
		// with parameter we can only "get" and we cannot "set" ...
		out.println("<li>"+ getServletConfig().getInitParameter("initparameter") + "</li>");
		out.println("<li>"+ getServletContext().getInitParameter("contextparameter") + "</li>");

		out.println("</ul>");

		out.println("<hr>");
		
		out.println("test context attr set by listener ...<br><br>");
		
		Conf conf = (Conf)getServletContext().getAttribute("conf");

		out.println("conf url is: " + conf.getUrl());
		
		out.println("<hr>");
		
		request.setAttribute("foo", "22");
		request.setAttribute("bar", "44");
		
		getServletContext().setAttribute("foo", "220");
		getServletContext().setAttribute("bar", "440");

		out.println("<ul>");
		out.println("<li>request.getAttribute('foo') = " + request.getAttribute("foo"));
		out.println("<li>request.getAttribute('bar') = " + request.getAttribute("bar"));
		out.println("<li>getServletContext().getAttribute('foo') = " + getServletContext().getAttribute("foo"));
		out.println("<li>getServletContext().getAttribute('bar') = " + getServletContext().getAttribute("bar"));
		out.println("</ul>");
		
		out.println("<hr>");

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	private void printHello(PrintWriter out) {
		out.println("<h1>Hello Servlet Get</h1>");
	}
}
