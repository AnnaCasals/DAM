package prova;

import java.io.*;

public class Proceso_llamar_dir {
	public static void main(String[] args) throws IOException {
		//File f = new File("C:\\Users\\alumno\\eclipse-workspace\\prova\\bin\\prova\\Proceso_dir.class");
		Process p = new ProcessBuilder("java", "-cp", "C:\\Users\\alumno\\eclipse-workspace\\prova\\bin", "prova.Proceso_dir").start();
		
		boolean a = p.isAlive();
		if(a) {
			System.out.println("El proceso sigue vivo");
		} else {
			System.out.println("El proceso se ha cerrado correctamente");
		}
	}
}
