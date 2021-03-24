package Animales;

public class Murcielago extends Mamiferos implements PuedeVolar {
	private int patas;
	private boolean salvaje;
	
	Murcielago() { 
		setEspecie("murciélago"); 
		setColor("negro");
		patas = 4;
		salvaje = true;
	}
	
	public int getPatas() { return patas; }
	public boolean getSalvaje() { return salvaje; }
	
	public void setPatas(int p) { patas = p; }
	public void setSalvaje(boolean s) { salvaje = s; }
	
	public void volar() { System.out.print("vuela, "); }
	public void caminar() { System.out.print("camina, "); }
}
