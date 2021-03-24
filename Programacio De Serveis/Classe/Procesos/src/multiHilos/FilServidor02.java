package multiHilos;

import java.io.*;
import java.net.*;

public class FilServidor02  extends Thread {
	PrintWriter fSalida;
	Socket socket = null;
	
	public FilServidor02(Socket s) throws IOException {
		socket = s;
		fSalida = new PrintWriter(socket.getOutputStream(), true);
	}
	
	public void run() {
		String cadena = "Eres el client ";
		System.out.println("COMUNICO CON: " + socket.toString());
		fSalida.print(cadena + Servidor02.n);
		
		System.out.println("Fin con: " + socket.toString());
		fSalida.close();
		
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
