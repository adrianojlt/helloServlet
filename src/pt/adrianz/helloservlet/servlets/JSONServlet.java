package pt.adrianz.helloservlet.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.ObjectMapper;

import pt.adrianz.helloservlet.beans.Article;

/**
 * Servlet implementation class JSONServlet
 */
@WebServlet("/jsonservlet")
public class JSONServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	List<Article> articles = new LinkedList<Article>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSONServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		
		String json = "";
		
		if (  reader != null ) { json = reader.readLine(); }
		
		ObjectMapper mapper = new ObjectMapper();
		
		Article article = mapper.readValue(json, Article.class);
		
		response.setContentType("application/json");
		
		articles.add(article);
		
		mapper.writeValue(response.getOutputStream(), articles);
	}
}
