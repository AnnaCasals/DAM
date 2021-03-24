package prova;

import java.io.*;

public class Proceso_dir {
	public static void main(String[] args) throws IOException {
		Process p = new ProcessBuilder("CMD", "/C", "DIR").start();
		try {
			InputStream ls = p.getInputStream();
			int c;
			while((c = ls.read()) != -1) {
				System.out.print((char) c);
			}
			ls.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
