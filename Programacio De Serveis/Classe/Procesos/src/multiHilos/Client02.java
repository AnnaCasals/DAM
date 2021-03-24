package multiHilos;

import java.io.*;
import java.net.*;

public class Client02 {
	public static void main(String[] args) {
		String host = "localhost";
		int puerto = 5555;
		
		try {
			Socket client = new Socket(host, puerto);
			System.out.println("Client Iniciat...");
			
			BufferedReader fentrada = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			String cadena = "";
			cadena = fentrada.readLine();
			System.out.println(cadena);
			
			fentrada.close();
			System.out.println("Fin del envío...");
			client.close();
			
		} catch(IOException io) {
			io.printStackTrace();
		}
	}
}
