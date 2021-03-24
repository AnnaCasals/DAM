import java.io.*;
public class Ejercicio2 {
	public static String leerCadena() {
		String cad = "";
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		try {
			cad = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return cad;
	}
	public static void main(String[] args) throws IOException {
		String cad;
		System.out.println("Este programa hace eco hasta que escriba 'para'");
		do {
			cad = leerCadena();
			System.out.println(cad);
		} while(!cad.equals("para"));
		System.out.println("FIN DEL PROGRAMA");
	}
}
