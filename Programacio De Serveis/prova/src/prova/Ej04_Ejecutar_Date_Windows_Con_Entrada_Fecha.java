package prova;

import java.io.*;

public class Ej04_Ejecutar_Date_Windows_Con_Entrada_Fecha {
	
	public static void main(String[] args) throws IOException {
		Process p = new ProcessBuilder("CMD", "/C", "DATE").start();
		
		//Escritura -- envia entrada a DATE
		OutputStream os = p.getOutputStream();
		os.write("19-12-19".getBytes());
		os.flush();//vacia el buffer de salida
		
		//lectura -- obtienen la salida de DATE
		InputStream is = p.getInputStream();
		int c;
		while((c = is.read()) != -1) {
			System.out.println((char) c);
		}
		is.close();
		
		//COMPROBACION DE ERROR - 0 bien -1 mal
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
