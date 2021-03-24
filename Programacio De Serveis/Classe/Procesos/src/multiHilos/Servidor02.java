package multiHilos;

import java.io.*;
import java.net.*;

public class Servidor02 {
	static int n = 0;
	static int lim = 3;
	static boolean a = true;
	
	public static void main(String[] args) throws IOException {
		ServerSocket servidor;	
		servidor = new ServerSocket(5555);
		
		System.out.println("Servidor iniciado...");
			
		while (a) {
			
			if(n < 3) {
				Socket cliente = new Socket();
				cliente = servidor.accept();//esperando cliente
				n++;
				FilServidor02 hilo = new FilServidor02(cliente);
				hilo.start();
			} else {
				a = false;
			}
		}
	}
}
