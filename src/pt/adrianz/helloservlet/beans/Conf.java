package pt.adrianz.helloservlet.beans;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Conf implements HttpSessionBindingListener{
	
	private String url;
	
	private int timeout;
	
	public Conf(String url) { this.url = url; }
	
	public String getUrl() { return url; }
	
	public void setTimeout(int timeout) { this.timeout = timeout; }

	public int getTimeout() { return this.timeout; }

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// code to run now that i know i am in a session
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// code to run now that i know i am no longer part of a session
		
	}
}
