package comunicacions_xarxes;

import java.net.*;

public class URL01 {
	public static void main(String[] args) {
		URL url;
		try {
			System.out.println("Constructor simple per a una URL");
			url = new URL("https://www.java.com/es/");
			Visualitzar(url);
			
			System.out.println("Un altre constructor simple per a una URL:");
			url = new URL("https://www.gva.es/es/inicio/area_de_prensa/not_detalle_area_prensa?id=601130");
			Visualizar(url);
			
			System.out.println("Const. per a protocol + URL + directori: ");
			url = new URL("https", "www.oracle.com", "/technetwork/java/");
			Visualizar(url);
			
			System.out.println("Constructor per a protocol + URL + port + directori: ");
			url = new URL("http", "localhost", 8084, "/WebApp/Controlador?accion=modificar");
			Visualizar(url);
			
			System.out.println("Constructor per a un objecte URL en un context: ");
			URL urlBase = new URL("https://docs.oracle.com/");
			url = new URL(urlBase, "/javase/9/docs/api/java/net/URL.html");
			Visualizar(url);
			
		} catch(MalformedURLException e) {
			System.out.println(e);
		}
	}
	
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
		System.out.println("\tgetDefaultPort(): " + url.getDefaultPort());
		
		System.out.println("========================================================");
	}
}
