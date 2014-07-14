package pt.adrianz.helloservlet.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import pt.adrianz.helloservlet.beans.Conf;

public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// code to initialize database connection and store it as a context attribute

		ServletContext context = event.getServletContext();
		
		Conf conf = new Conf(context.getInitParameter("urlXpto"));
		conf.setTimeout(210);
		
		context.setAttribute("conf", conf);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		
	}

}
