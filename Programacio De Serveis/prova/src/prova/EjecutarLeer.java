package prova;

import java.io.*;

public class EjecutarLeer {
	/*Utiliza el método waitFor() para comprobar el valor de salida del proceso que se ejecuta
	 * Prueba la ejecución del programa dando valor a los argumentos de main() y sin darle valor. 
	 * ¿Que devuelve waitFor() en un caso y en otro?
	 */
	
	public static void main(String[] args) throws IOException {
		File directorio = new File("C:\\Users\\alumno\\eclipse-workspace\\prova\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "-cp", "C:\\Users\\alumno\\eclipse-workspace\\prova\\bin", "prova.LeerNombre");
		Process p = pb.start();
		try {
			int a = p.waitFor();
			if(a == 0) {
				System.out.println("El proceso ha terminado bien");
			} else {
				System.out.println("El proceso ha terminado mal");
			}
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
