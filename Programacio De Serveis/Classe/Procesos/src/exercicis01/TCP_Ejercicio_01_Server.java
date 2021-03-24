package exercicis01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Ejercicio_01_Server {
	public static void main(String[] args) throws IOException{
		//Define en una variable el número de puerto y asígnale el valor 6000
		int numPort = 6001;
		
		//Crea socket servidor
		ServerSocket servidor = new ServerSocket(numPort);
		
		//Crea el socket cliente “clienteConectado” e inícialo a null
		Socket clientConectat = null;
		
		//Imprime en pantalla el mensaje “Esperando al cliente.....”
		System.out.println("Esperant al client...");
		
		//Acepta posible conexión
		clientConectat = servidor.accept();
		
		//CREA FLUJO DE SALIDA AL CLIENTE
		OutputStream salida = null;
		salida = clientConectat.getOutputStream();
		DataOutputStream flujoSalida = new DataOutputStream(salida);
		
		//ENVÍA UN SALUDO AL CLIENTE
		flujoSalida.writeUTF("SALUTACIONS al client del SERVIDOR");
		
		//CREA FLUJO DE ENTRADA DEL CLIENTE
		InputStream entrada = null;
		entrada = clientConectat.getInputStream();
		DataInputStream flujoEntrada = new DataInputStream(entrada);

		//Imprime el mensaje “Recibiendo del CLIENTE: “, salto de línea y tabulador, y el mensaje enviado por el cliente
		System.out.println("Rebent del CLIENT \n\t " + flujoEntrada.readUTF());
				
		
		//CERRAR STREAMS Y SOCKETS
		servidor.close();
		clientConectat.close();
		
		entrada.close();
		salida.close();
		
		flujoEntrada.close();
		flujoSalida.close();

	}// main
}
