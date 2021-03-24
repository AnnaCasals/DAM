import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.*;

public class Exercici1 {
	public static int cuentaPalabras(String d) {
		File f = new File(d);
		int a = 0;
		StringTokenizer x;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s = br.readLine()) != null) {
				x = new StringTokenizer(s);
				a += x.countTokens();
				while(x.hasMoreTokens()) {
					System.out.print(x.nextToken(" ") + "");
				} System.out.println();
			}
			if(fr != null) fr.close();
		} catch(FileNotFoundException fnf) {
			System.err.println("Fichero no encontrado " + fnf);
		} catch(IOException e) {
			System.out.println("Se ha producido una IOException");
			e.printStackTrace();
		} catch(Throwable e) {
			System.err.println("Error de programa " + e);
			e.printStackTrace();
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.println(cuentaPalabras("datos.txt"));
	}
}
