package pt.adrianz.helloservlet.webservices.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import pt.adrianz.helloservlet.beans.Article;

@Path("/hello")
public class HelloWorldRestService {
	
	@GET
	public Response getMain() {
		return Response.status(Response.Status.OK).entity("hello").build();
	}

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		
		String output = "Jersey says : " + msg;
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/InchToFeet/{i}")
	@Produces(MediaType.TEXT_XML)
	public String convertInchToFeet(@PathParam("i") int i) {  
		
		int inch = i;
		double feet = 0;
		feet = (double) inch/12;
		return "<InchToFeetService>"  + "<Inch>" + inch + "</Inch>"  + "<Feet>" + feet + "</Feet>"  + "</InchToFeetService>";  
	}
	
	 @Path("/FeetToInch/{f}")  
     @GET  
     @Produces(MediaType.APPLICATION_XML)  
     public String convertFeetToInch(@PathParam("f") int f) {  
      
		 int inch = 0;  
         int feet = f;  
         inch = 12*feet;  
    
         return "<FeetToInchService>"  + "<Feet>" + feet + "</Feet>"  + "<Inch>" + inch + "</Inch>"  + "</FeetToInchService>";  
     }  
	 
	 @GET
	 @Path("/article")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Article getArticle() {
		 
		 Article article = new Article();
		 List<String> categories = new ArrayList();
		 categories.add("webservices");
		 categories.add("mobile");
		 article.setTitle("how to REST");
		 article.setUrl("http://www.google.com");
		 article.setCategories(categories);

		 return article;
	 }
}
