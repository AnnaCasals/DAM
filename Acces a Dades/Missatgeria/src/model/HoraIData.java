package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HoraIData {
	public static Date hora() {
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		System.out.println("Hora: " + hourFormat.format(date));
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha: " + dateFormat.format(date));
		
		return date;
	}
	
	public static Date data() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha: " + dateFormat.format(date));
		System.out.println(date);
		return date;
	}
	
	public static void main(String[] args) {
	}
}
