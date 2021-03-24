package tema7;

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
			//Llig el fitxer mentre que hagen línies
			while((c = br.readLine()) != null) {
				//Passem les línies al String x
				x += c + " ";
				//Comptador per a saber les línies
				b++;
			}
			//Tanquem el Reader
			if(fr != null) fr.close();
			
			//Posem la llàrgaria a l'array
			a = new int[b];
			System.out.println(x);
			//Pasem el String a StringTokenizer, i dividim el String fins que haja espai(" ") i cadascún d'aquests a una posició de l'array
			m = new StringTokenizer(x);
			while(m.hasMoreTokens()) {
				for(int i = 0; i < a.length; i++) {
					a[i] = Integer.parseInt(m.nextToken(" "));
				}
			}
			//Ordenem el String
			ordena(a);
			//Mostrem el String
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			
			//Diem a quin fitxer volem escriure
			FileWriter fw = new FileWriter(fe);
			//Que volem escriure. Pasem el que hi ha al array a Strings posicions per posicions
			for(int i = 0; i < a.length; i++) {
				x = String.valueOf(a[i]);
				fw.write(x);
				fw.write("\r\n");
			}
			//Tanquem el Writer
			if(fw != null) fw.close();
			
		} catch(FileNotFoundException fnf) {
			System.err.println("Fichero no encontrado " + fnf);
		} catch(IOException e) {
			System.out.println("Se ha producido una IOException");
		} catch(Throwable e) {
			System.err.print("Error de programa " + e);
			e.printStackTrace();
		}
		
	}
	
	public static void ordena(int[] a) {
		int aux;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - 1; j++) {
				if(a[j] > a[j+1]) {
					aux = a[j+1];
					a[j+1] = a[j];
					a[j] = aux;
				}
			}
		}
	}
	public static void main(String [] args) throws IOException {
		leer("/home/alumno/Escritorio/Programació/numeros.txt");
	}
}
