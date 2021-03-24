package Tema5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Anys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Data actual*/
		GregorianCalendar c = new GregorianCalendar();
		Date d = new Date();
		c.setTime(d);
		System.out.println("La data actual és: " + c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH + 7)+ "/" + c.get(Calendar.YEAR));
		/* Data introduida */
		System.out.print("Data de naixement(dd/mm/aaaa): ");
		String b = sc.next(); 
		int dia = Integer.parseInt(b.substring(0, 2));
		int mes = Integer.parseInt(b.substring(3, 5));
		int any = Integer.parseInt(b.substring(6));
		
		int anys = c.get(Calendar.YEAR) - any; //Consegueix els anys
		//System.out.println(anys);
		if(c.get(Calendar.MONTH+7) < mes) { // Si el mes introduit és menor que el actual
			 anys--;						
		} if(mes == c.get(Calendar.MONTH+7)) { //Si el mes introduit és igual
			if(c.get(Calendar.DAY_OF_MONTH) < dia) { //Mirem el dia
				anys--;
			}
		}
		System.out.println("Segons la data tens " + anys + " anys.");
	}
}
