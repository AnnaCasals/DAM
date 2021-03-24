package envioObjetos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Ex02_Servidor {
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(1234);
			System.out.println("Esperando datagrama...");
			DatagramPacket recibo;
			
			//RECIBO DATAGRAMA 
			byte[] recibidos = new byte[1024];
			DatagramPacket paqRecibido = new DatagramPacket(recibidos, recibidos.length); 
			socket.receive(paqRecibido); //recibo el datagrama 
			
			//CONVERTIMOS BYTES A OBJETO 
			ByteArrayInputStream bais = new ByteArrayInputStream(recibidos); 
			ObjectInputStream in = new ObjectInputStream(bais);
			Persona persona = (Persona) in.readObject(); //obtengo objeto 
			
			InetAddress IPOrigen = paqRecibido.getAddress();
			int puerto = paqRecibido.getPort();
			
			System.out.println("El servidor recibe: " + persona.toString());
			persona.setNombre("Laia");
			persona.setEdad(20);
			
			System.out.println("El servidor envia: " + persona.toString());
			
			//CONVERTIMOS OBJETO A BYTES 
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(baos);
			out.writeObject(persona); //escribir objeto Persona en el stream 
			out.close(); //cerrar stream
			
			byte[] bytes = baos.toByteArray(); //objeto en bytes
			DatagramPacket paqEnviado = new DatagramPacket(bytes, bytes.length, IPOrigen, puerto);
			socket.send(paqEnviado);
			
			socket.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
			
	}

}
