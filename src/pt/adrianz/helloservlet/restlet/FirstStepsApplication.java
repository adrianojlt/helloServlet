package pt.adrianz.helloservlet.restlet;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class FirstStepsApplication extends Application {
	
	public synchronized Restlet createInboundRoot() {
		
		// route each call to a new instance of HelloWorldResource
		Router router = new Router(this.getContext());
		
		router.attach("/hello",HelloWorldResource.class);
		
		return router;
	}
}
