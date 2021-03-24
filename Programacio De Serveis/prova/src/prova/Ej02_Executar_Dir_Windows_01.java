package prova;
import java.io.*;

public class Ej02_Executar_Dir_Windows_01 {
	public static void main(String[] args) throws IOException {
		Process p = new ProcessBuilder("CMD", "/C", "DIR").start();
		try {
			InputStream is = p.getInputStream();
			int c;
			while((c = is.read()) != -1) {
				System.out.println((char) c);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
