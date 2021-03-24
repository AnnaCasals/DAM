package envioObjetos;

import java.io.*;
import java.net.Socket;
import java.util.*;

public class Ex01_Client {
	public static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) throws IOException,
	ClassNotFoundException {
		String host = "localhost";
		int port = 6000; //Port remot
		
		System.out.println("PROGRAMA CLIENT INICIAT...");
		Socket client = new Socket(host, port);
		
		System.out.println("Introdueix un número: (menor o igual a 0 pare) ");
		int num = sc.nextInt();
		
		while(num > 0) {
			Numeros numero = new Numeros();
			numero.setNumero(num);
			
			ObjectOutputStream outObjeto = new ObjectOutputStream(client.getOutputStream());
			outObjeto.writeObject(numero);
			
			ObjectInputStream inObjeto = new ObjectInputStream(client.getInputStream());
			numero = (Numeros) inObjeto.readObject();
			
			System.out.println("El quadrat del número " + numero.getNumero() + " és: " + numero.getCuadrado()
					+ " el cub del número és: " + numero.getCubo());
			
			System.out.println("Introdueix un número: (menor o igual a 0 para) ");
			num = sc.nextInt();
		}
		
		client.close();
	}
}
