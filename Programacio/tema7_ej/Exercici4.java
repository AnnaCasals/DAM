package tema7_ej;
import java.io.File;
public class Exercici4 {
	public static void main(String[] args) {
		File dir = new File("/home/alumno/Escritorio");
		if(dir.exists())
			System.out.println("Existe el directorio " + dir.getName());
		else
			System.out.println("El directorio no existe");
		
		if(dir.canRead())
			System.out.println("Existe el directorio y tiene permiso lectura");
		
		if(dir.canWrite())
			System.out.println("Existe el directorio y tiene permiso escritura");
		
		File[] ficheros = dir.listFiles();
		for(File f : ficheros)
			System.out.println(f.getName());
	}
}
