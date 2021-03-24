package exercicis;

import java.net.*;

public class URL01 {
	public static void main(String[] args) {
		URL url;
		try {
		  System.out.println("Constructor simple para una URL:");
		  url = new URL("https://www.java.com/es/");
		  Visualizar(url);
			
		  System.out.println("Otro constructor simple para una URL:");
		  url = new URL("http://www.gva.es/es/inicio/area_de_prensa/not_detalle_area_prensa?id=691130");
	        Visualizar(url);
			
		  System.out.println("Const. para protocolo +URL + directorio:");
		  url = new URL("https", "www.oracle.com", "/technetwork/java/");
		  Visualizar(url);

		  System.out.println("Constructor para protocolo + URL + puerto + directorio:");
	        url = new URL("http", "localhost", 8084, 
	                      "/WebApp/Controlador?accion=modificar");
	        Visualizar(url);
		  
		  System.out
		     .println("Constructor para un objeto URL en un contexto:");
		  URL urlBase = new URL("https://docs.oracle.com/");
		  url = new URL(urlBase, "/javase/9/docs/api/java/net/URL.html");
		  Visualizar(url);
		  
		 
		} catch (MalformedURLException e) {	System.out.println(e);}
	  }// main

	  private static void Visualizar(URL url) {
		System.out.println("\tURL completa: " + url.toString());	
		System.out.println("\tgetProtocol(): " + url.getProtocol());
		System.out.println("\tgetHost(): " + url.getHost());
		System.out.println("\tgetPort(): " + url.getPort());
		System.out.println("\tgetFile(): " + url.getFile());
		System.out.println("\tgetUserInfo(): " + url.getUserInfo());
		System.out.println("\tgetPath(): " + url.getPath());
		System.out.println("\tgetAuthority(): " + url.getAuthority());
		System.out.println("\tgetQuery(): " + url.getQuery());
		System.out.println("\tgetDefaultPort(): "+ url.getDefaultPort());
		System.out
	       .println("==================================================");
	  }

}
