package datagram01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Ex01_Client {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket = new DatagramSocket();
			
			InetAddress IPServidor = InetAddress.getLocalHost();
			int puerto = 12345;
			
			System.out.println("Introduce mensaje: ");
			String cadena = sc.nextLine();
			
			byte[] enviados = new byte[1024];
			enviados = cadena.getBytes();
			
			DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPServidor, puerto);
			clientSocket.send(envio);
			
			byte[] recibidos = new byte[2];
			DatagramPacket recibo = new DatagramPacket(recibidos, recibidos.length);
			System.out.println("Esperando datagrama...");
			clientSocket.receive(recibo);
			
			byte[] hh = recibo.getData();
			int numero = hh[0];
			
			System.out.println("Recibo el Nº de caracteres con a son => " + numero);
			
			clientSocket.close();
		} catch(IOException io) {
			io.printStackTrace();
		}
	}
}
