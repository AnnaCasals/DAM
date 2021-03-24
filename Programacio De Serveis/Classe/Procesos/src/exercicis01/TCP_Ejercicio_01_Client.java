package exercicis01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.*;

public class TCP_Ejercicio_01_Client {
	public static void main(String[] args) throws Exception {
		//Define la variable Host de tipo cadena y as�gnale el valor localhost	
		String host = "localhost";
		
		//Define una variable llamada Puerto para albergar el n�mero de puerto remoto y as�gnale el valor adecuado
		int port = 6001;
		
		//Imprime en pantalla el mensaje �PROGRAMA CLIENTE INICIADO.....�
		System.out.println("PROGRAMA CLIENT INICIAT...");
		
		//Crea socket cliente
		Socket client = new Socket();
		InetSocketAddress isa = new InetSocketAddress(host, port);
		client.connect(isa);
			
		//CREO FLUJO DE ENTRADA AL SERVIDOR (ll�malo flujoEntrada)
		InputStream entrada = client.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);
			
		//Imprime el mensaje �Recibiendo del SERVIDOR: �, salto de l�nea y tabulador, y el mensaje enviado por el SERVIDOR
		String abc = flujoEntrada.readUTF();
		System.out.println("Rebent del SERVIDOR: \n\t" + abc);
		
		//CREA FLUJO DE SALIDA AL SERVIDOR (ll�malo flujoSalida)
		
		abc = abc.toLowerCase();
		OutputStream salida = client.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);
		
		//ENV�A UN SALUDO AL SERVIDOR �Saludos al SERVIDOR DESDE EL CLIENTE�
		flujoSalida.writeUTF(abc);
		
		//CERRAR STREAMS Y SOCKETS
		client.close();
		
		salida.close();
		flujoSalida.close();
		
		entrada.close();
		flujoEntrada.close();

	}// main
}
