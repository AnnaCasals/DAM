package envioObjetos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex02_Client {
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket = new DatagramSocket();
			
			InetAddress IPServidor = InetAddress.getLocalHost();
			int puerto = 12345;
			
			Persona per = new Persona("María", 22);
			System.out.println("Cliente crea " + per.toString());
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
			ObjectOutputStream out = new ObjectOutputStream(baos); 
			out.writeObject(per); //escribir objeto Persona en el stream
			out.close(); //cerrar stream 
			byte[] bytes = baos.toByteArray();
			
			DatagramPacket paqEnviado = new DatagramPacket(bytes, bytes.length, IPServidor, puerto);
			clientSocket.send(paqEnviado);
			
			byte[] recibidos = new byte[1024];
			DatagramPacket paqRecibido = new DatagramPacket(recibidos, recibidos.length); 
			clientSocket.receive(paqRecibido); //recibo el datagrama
			
			ByteArrayInputStream bais = new ByteArrayInputStream(recibidos);
			ObjectInputStream in = new ObjectInputStream(bais); 
			Persona persona = (Persona) in.readObject(); //obtengo objeto 
			
			System.out.println("Cliente recibe " + persona.toString());
			
		} catch(IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
