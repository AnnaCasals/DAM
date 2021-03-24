package Primer;

import java.io.File;
import java.util.Scanner;

public class FitxersDirectoris {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);    //Scanner per a poder llegir
	        System.out.println("Ruta del directori: ");    
	        File dir = new File(sc.next());    //Nou fitxer amb la ruta que llegim amb el Scanner
	        
	        if(dir.exists()) { //El directori existeix??
	            System.out.println("El directori existeix, i els fitxers dins d'aquest son "); // Llistem
	            File[] f = dir.listFiles();
	            for(File a : f) {
	            	System.out.println(a.getName());
	            }
	        } else {
	            System.out.println("El directori introduït no existeix"); //Avisem a l'usuari que la ruta donada no existeix
	        }
	        
	        System.out.println("Per a crear un nou directori, introdueix el nom d'aquest(amb la ruta inclosa)");
	        File f = new File(sc.next());
	        if(!f.exists()) {
	        	f.mkdir();
	        } else {
	        	System.out.println("Ja existeix");
	        }
	}
}
