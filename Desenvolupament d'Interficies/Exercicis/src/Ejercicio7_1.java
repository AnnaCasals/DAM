import java.io.*;
public class Ejercicio7_1 {
	public static void main(String[] args) {
		String[] amigos = {"Andrés Rosique", "Pedro Ruiz", "Isaac Sánchez", "Juan Serrano"};
		long[] telefonos = {653364787, 627463746, 644567346, 623746348};
		try {
			FileOutputStream fs = new FileOutputStream("amigos.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			for(int i = 0; i < 4; i++) {
				Ejercicio7 a= new Ejercicio7(amigos[i], telefonos[i]);
				oos.writeObject(a);
			}
			if(oos != null) {
				oos.close();
				fs.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		} try {
				File f = null;
				FileInputStream fe = null;
				ObjectInputStream ois = null;
				try {
					f = new File("amigos.txt");
					if(f.exists()) {
						fe = new FileInputStream(f);
						ois = new ObjectInputStream(fe);
						while(true) {
							Ejercicio7 a = null;
							a = (Ejercicio7)ois.readObject();
							a.print();
							System.out.println(" ");
						}
					}
				} catch(EOFException eof) {
					System.out.println("......FIN DE FICHERO");
				} catch (FileNotFoundException fnf) {
					System.err.println("Fichero no encontrado " + fnf);
				} catch(IOException e) {
					System.err.println("Se ha produciodo una IOException");
					e.printStackTrace();
				} catch(Throwable e) {
					System.err.println("Error de programa" + e);
					e.printStackTrace();
				} finally {
					if(ois != null) {
						ois.close();
						fe.close();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
