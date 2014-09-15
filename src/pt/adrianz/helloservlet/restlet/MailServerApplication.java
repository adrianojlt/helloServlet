package pt.adrianz.helloservlet.restlet;

import org.restlet.Application;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.Restlet;
import org.restlet.Server;
import org.restlet.data.MediaType;
import org.restlet.data.Protocol;

public class MailServerApplication extends Application {
	
	public MailServerApplication() {
		this.setName("RESTful Mail server application");
		this.setDescription("example application for 'restlet in action' book");
	}
	
	public static void main(String[] args) throws Exception {
		
		Server mailserver = new Server(Protocol.HTTP, 8111);
		mailserver.setNext(new MailServerApplication());
		mailserver.start();
	}
	
	public Restlet createInboundRoot() {
		
		return new Restlet() {
			
			public void handle(Request request, Response response) {

				String entity = "Method: " + request.getMethod()
						+ "\nResource URI: "
						+ request.getResourceRef()
						+ "\nIP addresss : "
						+ request.getClientInfo().getAddress()
						+ "\nAgentName : "
						+ request.getClientInfo().getAgentName()
						+ "\nPort : "
						+ request.getClientInfo().getPort();
				
				response.setEntity(entity, MediaType.TEXT_PLAIN);
			}
		};
	}
}
