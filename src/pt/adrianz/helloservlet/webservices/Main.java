package pt.adrianz.helloservlet.webservices;

import javax.xml.ws.Endpoint;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8080/helloEJB/webservice", new WebService());
	}

}
