package clientServidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Exercici02_Servidor {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(12345);
			System.out.println("Esperando datagrama...");
			DatagramPacket recibo;
			byte[] bufer = new byte[1024];
			recibo = new DatagramPacket(bufer, bufer.length);
			socket.receive(recibo);
			
			String mensaje = new String(recibo.getData()).trim();
			System.out.println("Servidor recibe " + mensaje);
			
			mensaje = mensaje.toUpperCase();
			
			InetAddress IPOrigen = recibo.getAddress();
			int puerto = recibo.getPort();
			
			System.out.println("Enviando el mensaje en mayúsculas");
			
			byte b = (byte) Byte.parseByte(mensaje);
			byte[] enviados = new byte[1024];
			DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
			socket.send(envio);
			
			System.out.println("Cerrando conexión");
			socket.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
}
