package pt.adrianz.helloservlet.bis.session;

import org.apache.log4j.Logger;

public class StudentDetailsService implements BisService {

	static Logger logger = Logger.getLogger(StudentDetailsService.class);
	
	public StudentDetailsService() {
		super();
	}

	@Override
	public String getServiceName() {
		return null;
	}
}
