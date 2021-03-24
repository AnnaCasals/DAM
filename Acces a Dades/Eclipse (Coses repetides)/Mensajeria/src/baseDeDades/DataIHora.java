package baseDeDades;


import java.util.*;
import java.text.*;

public class DataIHora {
	DataIHora() {
		Date date = new Date();
		
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Hora: " + hourFormat.format(date));
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha: " + dateFormat.format(date));
		
		DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
		System.out.println("Hora y fecha: " + hourdateFormat.format(date));
	}
}
