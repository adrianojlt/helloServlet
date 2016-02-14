package pt.adrianz.helloservlet.webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FirstWebService {

  @WebMethod
   public String sayHello(String name) {
      return "Hello, " + name + ".";
   }
}
