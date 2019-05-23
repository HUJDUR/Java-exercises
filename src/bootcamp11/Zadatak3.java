package bootcamp11;

public class Zadatak3 {

	public static void main(String[] args) {
		
		nasumicni();

	}
	
	public static void nasumicni() {
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 5; j++)
				System.out.print((char) ((int)(Math.random() * ((90 - 65) + 1)) + 65) + " " + (int)(Math.random() * ((10 - 1) + 1)) + 1 + " ");
			System.out.println();
		}		
		
	}
	
	
}
