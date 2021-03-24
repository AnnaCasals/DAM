package tema4;

public class ProgramaInterfaz {
	public static void main(String[] args) {
		Persona pavaroti = new Persona();
		hacerCantar(pavaroti);
		Canario piolin = new Canario();
		hacerCantar(piolin);
		Gallo claudio = new Gallo();
		hacerCantar(claudio);
	}
	
	public static void hacerCantar(PuedeCantar cantar) {
		cantar.cantar();
	}
}
