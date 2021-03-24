import java.io.*;
import java.util.StringTokenizer;
public class Exercici3 {
	public static void leer(String d) {
		File fe = new File(d);
		int b = 0;
		int[] a;
		String c = " ";
		String x = ""; 
		StringTokenizer m;
		try {
			FileReader fr = new FileReader(fe);
			BufferedReader br = new BufferedReader(fr);
			while((c = br.readLine()) != null) {
				x += c + " ";
				b++;
			}
			if(fr != null)fr.close();
			a = new int[b];
			System.out.println(x);
			m = new StringTokenizer(x);
			while(m.hasMoreTokens()) {
				for(int i = 0; i < a.length; i++) {
					a[i] = Integer.parseInt(m.nextToken(" "));
				}
			}
			ordena(a);
			for(int i = 0; i <a.length; i++) {
				System.out.println(a[i] + " ");
			}
			FileWriter fw = new FileWriter(fe);
			for(int i = 0; i < a.length; i++) {
				x = String.valueOf(a[i]);
				fw.write(x);
				fw.write("\r\n");
				if(fw != null) fw.close();
			}
		} catch(FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado " + fnf);
		} catch(IOException e) {
				System.out.println("Se ha producido una IOException");
		} catch(Throwable e) {
				System.err.println("Error de programa " + e);
				e.printStackTrace();
		}
	}
	public static void ordena(int[] a) {
		int aux;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if(a[j]> a[j+1]) {
					aux = a[j+1];
					a[j+1] = a[j];
					a[j] = aux;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		leer("/home/alumno/Escritorio/Programació/numeros.txt");
	}
}
