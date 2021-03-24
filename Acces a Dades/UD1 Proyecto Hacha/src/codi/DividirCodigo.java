package codi;

import java.io.*;

public class DividirCodigo {
	
	public static void dividir(File f, int p) throws IOException {
		
		//Crea la variable per a poder llegir de l'arxiu "f" 
		FileInputStream fileIn = new FileInputStream(f);
		
		//Crea la variable per a poder escriure en un arxiu
		FileOutputStream fileOut = null;
		
		//Per a saber la llargària del fitxer
		float l = f.length();
		int b;
		
		//Mentre que hagen bytes per a llegir
		while((b = fileIn.read()) != -1) {
			int i;
			
			//Per a saber quants bytes llig sense l'última part
			int cont = 0;
			
			//Dividir l'arxiu en "parts-1" i escriure-ho
			for(i = 0; i < p-1; i++) {
				//En quin arxiu escriurem, si no existeix també el crea
				fileOut = new FileOutputStream(f.getAbsolutePath()+ "parte" + (i+1));
				for(int j = 0; j < (int)l/p; j++) {
					fileOut.write(b);
					b = fileIn.read();
					cont++;
				}
				//Tanquem l'escritura en l'arxiu creat(tanquem l'arxiu)
				fileOut.close();
			}
			
			//En quin arxiu escriurem, si no existeix també el crea. Creem l'última part
			fileOut = new FileOutputStream(f.getAbsolutePath() + "parte" + (i+1));
			
			//Escriu els bytes que queden per llegir
			for(int k = cont; k < l; k++) {
				fileOut.write(b);
				b = fileIn.read();
			}
			
			//Tanquem l'escriptura en l'arxiu(tanquem l'arxiu)
			fileOut.close();
		}
		//Tanquem la lectura de l'arxiu(tanquem l'arxiu)
		fileIn.close();
	}
	
	
	public static void main(String[] args) throws IOException {
	}
}
