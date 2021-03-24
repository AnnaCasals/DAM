package tema7_ej;
import java.io.*;

public class Exercici5 {
	//IBG
	//El programa tiene almacenados el nombre de unos amigos en un vector de
	//objetos String. Los datos de ese vector se copian en un fichero “amigos.txt”,
	//cada persona en una línea, para ello se graba en el fichero el retorno de carro
	//(\r) y el salto de línea (\n).
	//Para la lectura del fichero se utiliza un objeto FileReader. Como queremos
	//leer línea a línea usamos un objeto de la clase BufferReadered que tiene el
	//método readLine( ) que permite leer una línea de un flujo de entrada. La clase
	//BufferedReader es un reader.
	public static void main(String[] args) {
		String[] amigos = {"Andrés Rosique", "Pedro Ruiz", "Isaac Sánchez", "Juan Serrano"};
		File fs = new File("amigos.txt");
		try {
			FileWriter fw = new FileWriter(fs);
			for(String s: amigos) {
				fw.write(s, 0, s.length());
				fw.write("\r\n");
			}
			if(fw != null) fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File fe = new File("amigos.txt");
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String s = "";
				while((s=br.readLine()) != null) {
					System.out.println(s);
				}
				if(fr != null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
