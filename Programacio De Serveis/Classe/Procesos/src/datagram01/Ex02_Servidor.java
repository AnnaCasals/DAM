package datagram01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex02_Servidor {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(12345);
			System.out.println("Esperando datagrama...");
			
			DatagramPacket recibo;
			byte[] bufer = new byte[1024];
			recibo = new DatagramPacket(bufer, bufer.length);
			socket.receive(recibo);
			
			String mensaje = new String(recibo.getData()).trim();
			
			while(!mensaje.equals("*")) {
				
				System.out.println("Servidor recibe " + mensaje);
			
				mensaje = mensaje.toUpperCase();
				byte[] envio = new byte[1024];
				envio = mensaje.getBytes();
			
				InetAddress IPOrigen = recibo.getAddress();
				int puerto = recibo.getPort();
			
				DatagramPacket enviar = new DatagramPacket(envio, envio.length, IPOrigen, puerto);
				socket.send(enviar);
				
			}
			
			System.out.println("cerrando conexion");
			socket.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
