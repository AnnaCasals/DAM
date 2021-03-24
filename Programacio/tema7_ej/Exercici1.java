package tema7_ej;
import java.io.*;
public class Exercici1 {
//	Este ejemplo crea un String con datos a procesar y un array de caracteres de la misma longitud. Se
//	usa el objeto flujoEntrada de la clase StringReader para leer el String carácter a carácter. Los
//	caracteres leidos se van guardando en el objeto flujoSalida uno a uno hasta leer el carácter -1 que
//	indica el final del String. Una vez leídos todos los caracteres se copian al array arr con el método
//	toCharArray() del objeto flujoSalida de la clase CharArrayWriter. Por último, se cierran los flujos
//	abiertos con el método close().
	public static void main(String[] args) {
		String s = new String("En un lugar de la mancha de cuyo nombre no quiero acordarme, ");
		s = s + "no hace mucho tiempo que vivía un hidalgo de los de lanza en el astillero, ";
		s = s + "adarga antigua, rocín flaco y galgo corredor...";
		char [] arr = new char[s.length()];
		int car = 0;
		
		StringReader flujoEntrada = new StringReader(s);
		CharArrayWriter flujoSalida = new CharArrayWriter();
		
		try {
			while((car = flujoEntrada.read()) != -1) {
				flujoSalida.write(car);
			}
			arr = flujoSalida.toCharArray();
			System.out.println(arr);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			flujoEntrada.close();
			flujoSalida.close();
		}
	}

}
