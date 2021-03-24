package prova;

import java.io.*;

public class Ej03_Ejecutar_Dir_Windows02 {
	
	//define la función principal(main)
	public static void main(String[] args) throws IOException {
		//Crea un objeto File correspondiente al directorio donde está
		//Ej02_Ejecutar_Dir_Windows01.java
		File directorio = new File("C:\\JAVASPS\\Ej02_Ejecutar_Dir_Windows01\\bin\\");
		//Establece los atributos del nuevo proceso(el comando será java y debe ejecutar
		//Ej02_Ejecutar_Dir_Windows01)
		ProcessBuilder pb = new ProcessBuilder("java", "-cp", "C:\\JAVAPSP\\Ej02_Ejecutar_Dir_Windows01\\bin", "ej02_Ejercicio_Dir_Windows01.ej02_Ejecutar_Dir_Windows01");
		//establece el directorio de trabajo del nuevo proceso(donde actuará el ejecutable)
		pb.directory(directorio);
		//Muestra por pantalla (System.out.printf) el mensaje "Directorio de trabajo: ", 
		//con el nombre correspondiente del directorio del ejecutable
		System.out.printf("Directorio de trabajo: %s%n%n%n", pb.directory());
		//inicia el nuevo proceso a ejecutar
		Process p = pb.start();
		//Obtiene la salida del proceso controlando el posible error
		try {
			//Define el stream correspondiente (llamado is)
			InputStream is = p.getInputStream();
			//Define una variable entera llamada c
			int c;
			//mientras al leer del stream no da error, imprimir contenido de la variable
			//c con System.out.print
			while ((c = is.read()) != -1) {
				System.out.print((char) c);
			}
			//cerrar stream
			is.close();
		} catch (Exception e) {
			//Imprimir información sobre el error
			e.printStackTrace();
		}
		try {
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while((liner = brer.readLine()) != null) {
				System.out.print("ERROR >" + liner);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}

