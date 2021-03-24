package tema3;

public class Pajaro {
	private char color;
	private int edad;
	
	public void pajaro() { edad = 0; color = 'v'; }
	
	public void setEdad(int e) { edad = e; }
	
	public void printEdad() { System.out.println(edad); }
	
	public void setColor(char c) { color = c; }
	
	public static void main(String[] args) {
		Pajaro a = new Pajaro();
		a.printEdad();
		a.setColor('v');
		a.setEdad(9);
		a.printEdad();
	}
}
