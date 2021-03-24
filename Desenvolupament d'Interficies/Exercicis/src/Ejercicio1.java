import java.io.*;
public class Ejercicio1 {
	public static void main(String[] args) {
		String s = new String("En un lugar de la mancha de cuyo nombre no quiero acordarme, ");
		s = s + "no hace mucho tiempo vivía un hidalgo de los de lanza en el astillero, ";
		s = s + "adarga antigua, rocín flaco y galgo corredor...";
		char[] arr= new char[s.length()];
		int car = 0;
		StringReader flujoEntrada = new StringReader(s);
		CharArrayWriter flujoSalida = new CharArrayWriter();
		try {
			while((car = flujoEntrada.read()) != -1) {
				flujoSalida.write(car);
			}
			arr = flujoSalida.toCharArray();
			System.out.println(arr);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			flujoEntrada.close();
			flujoSalida.close();
		}
	}
}
