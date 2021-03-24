package Animales;

public class Loro extends Aves implements PuedeVolar{
	private boolean salvaje;
	
	Loro() { 
		setEspecie("loro"); 
		setColor("blanco");
		salvaje = true;
	}
	
	public boolean getSalvaje() { return salvaje; }
	
	public void setSalvaje(boolean s) { salvaje = s; }
	
	public void volar() { System.out.print("vuela, "); }
	public void caminar() { System.out.print("camina, "); }
}
