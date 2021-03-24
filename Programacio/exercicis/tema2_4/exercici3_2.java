package tema2_4;

public class exercici3_2 {
	public static void main(String[] args) {
		int base = 7;
		
		for(int i = 1; i <= base/2+1; i++) {
			for(int k = 1; k <= base/2-i+1; k++) {
				System.out.print("-");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int z = base / 2; z >= 1; z--) {
			for(int j = base / 2 - z + 1; j >= 1; j--) {
				System.out.print("-");
			}
			for(int k= 2*z - 1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
