package pt.adrianz.helloservlet.servlet.webapi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected List<String> params = new ArrayList<>();
	protected String[] parameters;
	
	public MainServlet() {

		params.add("pass");
		params.add("user");
		//params.add("link");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		try {
			
			if ( validations(request,out) ) {
				
				// do something ...
				out.println("data processed with success");
				response.setStatus(HttpServletResponse.SC_OK);
			}
			
		} catch ( Exception e ) { 

		} finally {
			out.flush();
			out.close();
		}

		response.setStatus(HttpServletResponse.SC_OK);
	}
	
	private boolean validations(HttpServletRequest request, PrintWriter out) {
		
		// validate null parameters
		if ( hasNullParameters(request) ) {
			out.print("NULLS");
			return false;
		}
		
		// validate country conf
		if ( isCountryConfigured(request) ) {
			out.print("NO_COUNTRY");
			return false;
		}
		
		// validate login
		
		// validate club conf
		
		// validate msisdn 
		
		// validate customer

		return true;
	}
	
	private boolean hasNullParameters(HttpServletRequest request) {
		Enumeration<String> names = request.getParameterNames();
		List<String> list = Collections.list(names);
		return !list.containsAll(params);
	}
	
	private boolean isCountryConfigured(HttpServletRequest request) {
		return false;
	}
}
