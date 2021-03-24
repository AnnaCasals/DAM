package tema7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercici2 {
	  public static void aplicaCensura(String d, String a, String b ) throws IOException {
	        try {
	            File fe = new File(d);
	            FileReader fr = new FileReader(fe);
	            BufferedReader br = new BufferedReader(fr);
	            File fs = new File(b);
	            FileWriter fw = new FileWriter(fs);
	            String s = " ";
	            while((s = br.readLine()) != null) {
	                File fc = new File(a);
	                FileReader frc = new FileReader(fc);
	                BufferedReader brc = new BufferedReader(frc);
	                String scen;
	                while((scen =brc.readLine()) != null) {
	                    StringTokenizer str;
	                    str = new StringTokenizer(scen);
	                    s = s.replace(str.nextToken(), str.nextToken());
	                }
	                System.out.println(s);
	                fw.write(s);
	                fw.write("\r\n");
	                if(frc != null)frc.close();
	            }
	            if(fw !=null) fw.close();
	            if(fr != null) fr.close();
	           
	        }catch(FileNotFoundException fnf){
	            System.err.println("Fichero no encontrado");
	        }
	       
	    }
	    public static void main(String [ ]args) throws IOException {
	       
	        aplicaCensura("/home/alumno/Escritorio/Programació/texto.txt","/home/alumno/Escritorio/Programació/censura.txt", "/home/alumno/Escritorio/Programació/renovado.txt");
	    }
}
