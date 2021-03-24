package prova;

import java.io.*;

public class Ej05_Ejemplo_Lectura2 {
	public static void main(String[] args) {
		File directorio = new File("C:\\Users\\alumno\\eclipse-workspace\\prova\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "prova.Ej05_Ejemplo_Lectura");
		pb.directory(directorio);
		
		try {
			//se ejecuta el proceso
			Process p = pb.start();
			
			//escritura - se envia la entrada
			OutputStream os = p.getOutputStream();
			os.write("Hola Manuel \n".getBytes());
			
			//vacia el búfer de salida
			os.flush();
			
			//Lectura -- obtiene la salida del subproceso
			InputStream is = p.getInputStream();
			int c;
			while((c = is.read()) != -1) {
				System.out.print((char) c);
			}
			is.close();
			
			//COMPROBACION DE ERROR - 0 bien - 1 mal
			int exitVal;
			try {
				exitVal = p.waitFor();
				System.out.println("Valor de Salida: " + exitVal);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
