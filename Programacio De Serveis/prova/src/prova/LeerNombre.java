package prova;

public class LeerNombre {
	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println(args.toString());
			System.exit(1);
		} else {
			System.exit(-1);
		}
	}
}


