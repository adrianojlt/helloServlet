package pt.adrianz.helloservlet.bis.cp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class GetStudentDetailsCP extends BisCP implements BisCommand {

	static Logger logger = Logger.getLogger(GetStudentDetailsCP.class);
	
	public GetStudentDetailsCP() {
		super();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String studentId = null;
		
		if ( session != null )
			studentId = (String)session.getAttribute("StudentId");
		
		//if ( studentId != null )
			
		return null;
	}

}
