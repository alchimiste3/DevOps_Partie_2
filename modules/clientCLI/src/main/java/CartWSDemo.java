import stubs.cart.CartWebService;
import stubs.cart.CartWebServiceImplService;
import stubs.cart.Cookies;
import stubs.cart.Item;
import stubs.customerCare.CustomerCareService;
import stubs.customerCare.CustomerCareServiceImplService;

import javax.xml.ws.BindingProvider;


import java.net.URL;
import java.util.List;

public class CartWSDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("#### Collecting arguments (host, port)");
		String host = ( args.length == 0 ? "localhost" : args[0] );
		String port = ( args.length < 2  ? "8080"      : args[1] );
		CartWebService cartws = initializeCartWebService(host, port);
	    CustomerCareService custumerws = initializeCustomerWebService(host, port);
		System.out.println("#### Running the demo");
		demo(cartws,custumerws);

	}

	private static void demo(CartWebService cartws, CustomerCareService custumerws) throws Exception {
		try{
		    custumerws.register("john", "1234-896983");
//		    custumerws.listAllRecipes();
//			 List<Item> cart = cartws.getCustomerCartContents("john");
			// System.out.println("Cart is empty: " + cart.isEmpty());
			// Item i = new Item();
			// i.setCookie(Cookies.CHOCOLALALA);
			// i.setQuantity(3);
			// ws.addItemToCustomerCart("john", i);
			// i.setCookie(Cookies.DARK_TEMPTATION);
			// i.setQuantity(2);
			// ws.addItemToCustomerCart("john", i);
			// i.setCookie(Cookies.CHOCOLALALA);
			// i.setQuantity(4);
			// ws.addItemToCustomerCart("john", i);
			// cart = ws.getCustomerCartContents("john");
			// System.out.println("John's cart: " +cart);
		}
		catch(Exception e ){
			System.out.println("Probleme demo → "+e.getMessage());
		}

	}

	private static CartWebService initializeCartWebService(String host, String port) {
		System.out.println("#### Loading the WSDL contract");
		URL wsdlLocation = CartWSDemo.class.getResource("/CartWS.wsdl");
		System.out.println("#### Instantiating the WS Proxy");
		CartWebServiceImplService factory = new CartWebServiceImplService(wsdlLocation);
		CartWebService ws = factory.getCartWebServiceImplPort();
		System.out.println("#### Updating the endpoint address dynamically");
		String address = "http://"+host+":"+port+"/tcf-webServices/webservices/CartWS";
		((BindingProvider) ws).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
		return ws;
	}

    private static CustomerCareService initializeCustomerWebService(String host, String port) {
        System.out.println("#### Loading the WSDL contract");
        URL wsdlLocation = CartWSDemo.class.getResource("/CustomerCareWS.wsdl");
        System.out.println("#### Instantiating the WS Proxy");
        CustomerCareServiceImplService factory = new CustomerCareServiceImplService(wsdlLocation);
        CustomerCareService ws = factory.getCustomerCareServiceImplPort();
        System.out.println("#### Updating the endpoint address dynamically");
        String address = "http://"+host+":"+port+"/tcf-webServices/webservices/CartWS";
        ((BindingProvider) ws).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
        return ws;
    }

}
