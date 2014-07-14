package pt.adrianz.helloservlet.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class RegistrationForm extends ActionForm{
	
	private static final long serialVersionUID = 1L;

	private String firstname;
	private String lastname;
	private String email;

	// Setters and Getters ...
	public String getFirstname() { return firstname; }
	public void setFirstname(String firstname) { this.firstname = firstname; }
	public String getLastname() { return lastname; }
	public void setLastname(String lastname) { this.lastname = lastname; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request ) {
		
		ActionErrors errors = new ActionErrors();
		
		return errors;
	}
}
