package pt.adrianz.helloservlet.bis.cp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BisCommand {
	public abstract String execute(HttpServletRequest request, HttpServletResponse response);
}
