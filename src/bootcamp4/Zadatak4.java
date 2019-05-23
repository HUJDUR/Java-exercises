package bootcamp4;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int broj = 17;
		int brojac = 0;
		int sabirak = 1;
		
		for (int i = sabirak; i < broj; i++) {
			for (int j = 0; j < broj; j++) {
				if (j + i == broj) {
					System.out.printf("%d + %d = " + (i + j), j, i);
					System.out.println();
					brojac++;
				} 
			}
		}
		
		System.out.println("\nMoguc broj kombinacija je: " + brojac);
		
	}

}
