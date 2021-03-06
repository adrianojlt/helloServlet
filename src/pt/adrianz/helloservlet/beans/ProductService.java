package pt.adrianz.helloservlet.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductService {
	
	private HashMap<Integer, Product> products = new HashMap<Integer, Product>();

	public ProductService() {
		
		products.put(1, new Product(1,"shoes", 200.12));
		products.put(2, new Product(2,"jacket", 49.00));
		products.put(3, new Product(3,"suit", 230.00));
	}
	
	public Product getProduct(int id) {
		return this.products.get(id);
	}
	
	public List<Product> getProducts() {
		List<Product> productsList = new ArrayList<Product>(this.products.values());
		return productsList;
	}
}
