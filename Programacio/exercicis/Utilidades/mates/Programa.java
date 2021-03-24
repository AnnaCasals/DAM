package Utilidades.mates;
import java.io.*;
public class Programa {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		
		//SUMA
		System.out.println("Introduce un número: ");
		int a = Integer.parseInt(buff.readLine());
		System.out.println("Introduce un número: ");
		int b = Integer.parseInt(buff.readLine());
		Sumar r = new Sumar();
		System.out.println(r.suma(a, b));
		
		//POTENCIA
		System.out.println("Introduce un número: ");
		int c = Integer.parseInt(buff.readLine());
		System.out.println("Introduce un número: ");
		int d = Integer.parseInt(buff.readLine());
		Potenciar z = new Potenciar();
		System.out.println(z.potencia(c, d));
	}
}
