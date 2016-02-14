package pt.adrianz.helloservlet.webservices.soap;

@javax.jws.WebService(
		endpointInterface = "pt.adrianz.helloservlet.webservices.WebServiceExample")
public class WebService implements WebServiceExample {

	@Override
	public String helloWS(String name) {

		return "hello, welcome to jax-ws " + name;
	}

	@Override
	public String reverse(String text) {

		if ( text == null ) return null;
		
		return new StringBuffer(text).reverse().toString();
	}

	@Override
	public int add(int i, int j) {

		int k = i + j;
		return k;
	}
}
