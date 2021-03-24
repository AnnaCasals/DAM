package datagram01;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Ex02_Client {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket = new DatagramSocket();
			
			InetAddress IPServidor = InetAddress.getLocalHost();
			int puerto = 12345;
			
			System.out.println("Introduce mensaje: ");
			String cadena = sc.nextLine();
			
			while(!cadena.equals("*")) {
				byte[] enviados = new byte[1024];
				enviados = cadena.getBytes();
			
				DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPServidor, puerto);
				clientSocket.send(envio);
			
				byte[] recibidos = new byte[1024];
				DatagramPacket recibo = new DatagramPacket(recibidos, recibidos.length);
				System.out.println("Esperando datagrama...");
				
				clientSocket.setSoTimeout(5000);
				clientSocket.receive(recibo);
				
				String mensaje = new String(recibo.getData()).trim();
				System.out.println("Recibo el mensaje recibido en mayuscula es => " + mensaje);
				
				System.out.println("Introduce otro mensaje(finaliza cuando introduces '*'): ");
				cadena = sc.nextLine();
			}
			
			clientSocket.close();
				
		} catch(IOException io) {
			io.printStackTrace();
		}
	}
}
