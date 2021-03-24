package envioObjetos;

import java.io.*;
import java.net.*;

public class Ex01_Servidor {
	public static void main(String[] args) throws IOException,
	ClassNotFoundException {
		int numeroPuerto = 6000;
		ServerSocket servidor = new ServerSocket(numeroPuerto);

		System.out.println("Esperando al cliente...");
		Socket cliente = servidor.accept();
		
		ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
		Numeros num = (Numeros) inObjeto.readObject();
		
		int n = num.getNumero();
		num.setCuadrado(n * n);
		num.setCubo(n * n * n);
		
		ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
		outObjeto.writeObject(n);
	
		cliente.close();
	}
}
