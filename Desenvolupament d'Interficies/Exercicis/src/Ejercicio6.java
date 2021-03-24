import java.io.*;
public class Ejercicio6 {
	public static void main(String[] args) {
		String[] amigos = {"Andr�s Rosique","Pedro Ruiz", "Isaac S�nchez", "Juan Serrano"};
		long[] telefonos = {653364787, 627469746, 644567146, 623746348};
		try {
			FileOutputStream fs = new FileOutputStream("amigos.txt");
			DataOutputStream d = new DataOutputStream(fs);
			for(int i = 0; i < 4; i++) {
				d.writeUTF(amigos[i]);
				d.writeLong(telefonos[i]);
			}
			if(d != null ) {
				d.close();
				fs.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		try {
			File f = null;
			FileInputStream fe = null;
			DataInputStream d = null;
			try {
				f = new File("amigos.txt");
				if(f.exists()) {
					fe = new FileInputStream(f);
					d = new DataInputStream(fe);
					String s;
					Long l;
					while(true) {
						s = d.readUTF();
						System.out.print(s + "->");
						l = d.readLong();
						System.out.print(l);
						System.out.println();
					}
				} 
			} catch (EOFException eof) {
				System.out.println("...FIN DE FICHERO");
			} catch(FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado" + fnf);
			} catch (IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			} catch(Throwable e) {
				System.err.println("Error de programa " + e);
				e.printStackTrace();
			} finally {
				if(d != null) {
					d.close();
					fe.close();
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
