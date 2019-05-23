package ZadaciLjetnaPauza_1208;

import java.util.Random;

public class BrojNasumicnihBrojeva {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] brojac = new int[10];
		
		for(int i = 0; i < 100; i++) {
			int broj = random.nextInt(10);
			
			for(int j = 0; j < 10; j++) {
				if (j == broj)
					brojac[j]++;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			if(brojac[i] != 0)
				System.out.printf("Broj %d se ponavlja %d puta\n", i, brojac[i]);
		}
		
		
		
		
		
	}

}
