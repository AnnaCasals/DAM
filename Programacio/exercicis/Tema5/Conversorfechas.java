package Tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversorfechas {
	String normaltoAmericano(String p) {
		return p.substring(3, 5) + "/" + p.substring(0, 2) + "/" + p.substring(6);
	}
		/* String normalToAmericano(String p) {
		 *     String d = p.substring(0, 2);
		 * 	   String m = p.substring(3, 5);
		 * 	   String y = p.substring(6, 10);
		 *     return m + "/" + d + "/" + y; 
		 * }
		 */	
	
	String americanotonormal(String p) {
		return p.substring(3, 5) + "/" + p.substring(0, 2) + "/" + p.substring(6);
	}
		/* String americanoToNormal(String p) {
		 *    String m = p.substring(0, 2);
		 *    String d = p.substring(3, 5);
		 *    String y = p.substring(6, 10);
		 *    return d + "/" + m + "/" + y;
		 * }
		 */
	
	public static void main(String[] args) throws IOException {
		Conversorfechas s = new Conversorfechas();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(isr);
		System.out.print("Introduzca la fecha en el formato europeo dd/mm/yyyy ");
		String fecha = buff.readLine();
		System.out.println("Formato americano: " + s.normaltoAmericano(fecha));
		System.out.print("Introduzca la fecha en el formato americano mm/dd/yyyy ");
		String fecha1 = buff.readLine();
		System.out.println("Formato europeo: " + s.americanotonormal(fecha1));
	}
	/* public static void main(String[] args) {
	 *    Conversorfechas b = new Conversorfechas();
	 *    String a = "13/10/1997";
	 *    String c = "12/25/1992";
	 *    System.out.println(b.normaltoAmericano(a));
	 *    System.out.println(b.americanotonormal(c));
	 * }
	 */
}
