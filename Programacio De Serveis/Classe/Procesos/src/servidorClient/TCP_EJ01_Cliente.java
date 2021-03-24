package servidorClient;

import java.io.*;
import java.net.*;

public class TCP_EJ01_Cliente {
	public static void main(String[] args) throws Exception {
		//Define la variable Host de tipo cadena y asígnale el valor localhost	
		String host = "localhost";
		
		//Define una variable llamada Puerto para albergar el número de puerto remoto y asígnale el valor adecuado
		int port = 6000;
		
		//Imprime en pantalla el mensaje “PROGRAMA CLIENTE INICIADO.....”
		System.out.println("PROGRAMA CLIENT INICIAT...");
		
		//Crea socket cliente
		Socket client = new Socket(host, port);
		
		//CREA FLUJO DE SALIDA AL SERVIDOR (llámalo flujoSalida)
		OutputStream salida = client.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);
		
		//ENVÍA UN SALUDO AL SERVIDOR “Saludos al SERVIDOR DESDE EL CLIENTE”
		flujoSalida.writeUTF("Salutacions al servidor des del client");
			
		//CREO FLUJO DE ENTRADA AL SERVIDOR (llámalo flujoEntrada)
		InputStream entrada = client.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);
			
		//Imprime el mensaje “Recibiendo del SERVIDOR: “, salto de línea y tabulador, y el mensaje enviado por el SERVIDOR
		System.out.println("Rebent del SERVIDOR: \n\t" + flujoEntrada.readUTF());
		
		//CERRAR STREAMS Y SOCKETS
		client.close();
		
		salida.close();
		flujoSalida.close();
		
		entrada.close();
		flujoEntrada.close();

	}// main
}// TCP_EJ01_Cliente


