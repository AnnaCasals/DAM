package servidorClient;

import java.io.*;
import java.net.*;

public class TCP_EJ01_Servidor {
	public static void main(String[] args) throws IOException{
		//Define en una variable el n�mero de puerto y as�gnale el valor 6000
		int numPort = 6000;
		
		//Crea socket servidor
		ServerSocket servidor = new ServerSocket(numPort);
		
		//Crea el socket cliente �clienteConectado� e in�cialo a null
		Socket clientConectat = null;
		
		//Imprime en pantalla el mensaje �Esperando al cliente.....�
		System.out.println("Esperant al client...");
		
		//Acepta posible conexi�n
		clientConectat = servidor.accept();
		
		//CREA FLUJO DE ENTRADA DEL CLIENTE
		InputStream entrada = null;
		entrada = clientConectat.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);

		//Imprime el mensaje �Recibiendo del CLIENTE: �, salto de l�nea y tabulador, y el mensaje enviado por el cliente
		System.out.println("Rebent del CLIENT \n\t " + flujoEntrada.readUTF());
		
		//CREA FLUJO DE SALIDA AL CLIENTE
		OutputStream salida = null;
		salida = clientConectat.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);

		//ENV�A UN SALUDO AL CLIENTE
		flujoSalida.writeUTF("Salutacions al client del servidor");
		
		//CERRAR STREAMS Y SOCKETS
		servidor.close();
		clientConectat.close();
		
		entrada.close();
		salida.close();
		
		flujoEntrada.close();
		flujoSalida.close();

	}// main
}// TCP_EJ01_Servidor
