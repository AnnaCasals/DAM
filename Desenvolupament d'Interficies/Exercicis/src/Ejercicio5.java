import java.io.*;
public class Ejercicio5 {
	public static void main(String[] args) {
		String[] amigos = {"Andrés Rosique", "Pedro Ruiz", "Isaac Sánchez", "Juan Serrano"};
		File fs = new File("amigos.txt");
		try {
			FileWriter fw = new FileWriter(fs);
			for(String s :amigos) {
				fw.write(s, 0, s.length());
				fw.write("\r\n");
			}
			if(fw != null) fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		File fe = new File("amigos.txt");
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String s = "";
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
