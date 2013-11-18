package pt.adrianz.helloservlet.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.soap.SOAPElement;

/**
 *  Web Service Endpoint SEI
 * @author adriano
 *
 */
@WebService
//@SOAPBinding(style = Style.RPC)
public interface WebServiceExample {
	
	@WebMethod
	public String helloWS(String name);

	@WebMethod
	public String reverse(String text);

	@WebMethod
	public int add(@WebParam(name="i") int i, @WebParam(name="j") int j);
	
	//@WebMethod
	//public String soapExample(SOAPElement soapArg);
}
