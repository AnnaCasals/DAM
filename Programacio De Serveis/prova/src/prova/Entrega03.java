package prova;

import java.io.*;

public class Entrega03 {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		int a, b, c;
		
		try {
			System.out.println("Introdueix un nombre enter... ");
			a = br.read();
			System.out.println("Introdueix un altre nombre enter... ");
			b = br.read();
			c = a + b;
			System.out.println("Suma dels nombres enters " + c);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
