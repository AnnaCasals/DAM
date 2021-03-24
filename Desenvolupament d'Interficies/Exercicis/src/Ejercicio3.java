import java.io.*;
public class Ejercicio3 {
	public static void main(String[] args) {
		FileOutputStream f = null;
		String s = "En un lugar de la mancha cuyo nombre no quiero acordarme...";
		char c = 0;
		try {
			f = new FileOutputStream("datos.txt");
			for(int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				f.write((byte) c);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		FileInputStream g = null;
		s = "";
		try {
			g = new FileInputStream("datos.txt");
			int size = g.available();
			for(int i = 0; i < size; i++) {
				c = (char) g.read();
				s = s + c;
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(s);
			try {
				g.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
