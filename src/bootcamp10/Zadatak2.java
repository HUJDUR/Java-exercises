package bootcamp10;

public class Zadatak2 {

	public static void main(String[] args) {
		
		raspon();
		
	}

	public static void raspon() {
		
		int brojac = 0;
		
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.printf("%d  %d\n", i, j);
				brojac++;
			}
			System.out.println();
		}	
		
		System.out.println("Ukupan broj kombinacija: " + brojac);
	}
	
}
