package pt.adrianz.helloservlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pt.adrianz.helloservlet.beans.ProductService;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/ListServlet")
public class ProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductService service = new ProductService();
		
		String id = request.getParameter("id");
		
		String page;
		
		if ( id == null ) { // list all
			request.setAttribute("products", service.getProducts());
			page = "/product/list.jsp";
		}
		else { // product detail
			request.setAttribute("product", Integer.parseInt(id));
			page = "/product/view.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
