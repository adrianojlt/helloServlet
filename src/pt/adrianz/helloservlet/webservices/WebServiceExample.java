package pt.adrianz.helloservlet.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface WebServiceExample {
	
	@WebMethod
	public String helloWS(String name);

	@WebMethod
	public String reverse(String text);

	@WebMethod
	public int add(@WebParam(name="i") int i, @WebParam(name="j") int j);
}
