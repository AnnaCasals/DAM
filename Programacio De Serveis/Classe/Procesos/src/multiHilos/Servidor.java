package multiHilos;

import java.io.*;
import java.net.*;

public class Servidor {
	public static void main(String args[]) throws IOException  {
		ServerSocket servidor;		
		servidor = new ServerSocket(4444);
		
		System.out.println("Servidor iniciado...");
		
		while (true) {	
			Socket cliente = null;
			cliente = servidor.accept();//esperando cliente
			
			System.out.println("=> Conecta IP " + cliente.getInetAddress() + ", Puerto remoto: " + cliente.getPort());
			HiloServidor hilo = new HiloServidor(cliente);
			hilo.start();		
		}
	}
}
