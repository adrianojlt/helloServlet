package pt.adrianz.helloservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.adrianz.helloservlet.beans.Product;

/**
 * Servlet implementation class BeingJSTL
 */
//@WebServlet("/BeingJSTL")
public class BeingJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeingJSTL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Product shirt = new Product(1, "t-shirt", 200);
		Product shoes = new Product(2, "shoes", 150);
		
		List<Product> product = new ArrayList<Product>();
		product.add(shirt);
		product.add(shoes);

		request.setAttribute("shirt", shirt);
		request.setAttribute("shoes", shoes );
		request.setAttribute("product", product);
		
		//String contextPath = request.getContextPath();
		
		String[] musics = {"radio", "unforgettable fire","nothing else matters"};
		request.setAttribute("musics", musics);
		
		ArrayList<String> musicsArrayList = new ArrayList<String>();
		musicsArrayList.add("radio");
		musicsArrayList.add("unforgettable fire");
		musicsArrayList.add("nothing else matters");
		request.setAttribute("musicsArrayList", musicsArrayList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("beingJSTL.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
