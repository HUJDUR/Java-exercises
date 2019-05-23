package bootcamp18;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite niz brojeva:");
		ArrayList<Integer> niz = new ArrayList<>();
		int broj;
		int brojac = 0;
		
		do {
			broj = input.nextInt();
			niz.add(broj);
		} while (broj != 0);
		
		input.close();
		
		for (int i = 0; i < niz.size() - 1; i++) {
			for (int j = 0; j < niz.size() - 1; j++) {
				if (niz.get(j) == niz.get(i)) 
					brojac++;
			}
						
			if (brojac > 1) 
				System.out.printf("Broj %d se ponavlja %d puta\n", niz.get(i), brojac);
			else
				System.out.printf("Broj %d se ponavlja 1 put\n", niz.get(i));		
			
			niz.remove(i);
			brojac = 0;	
		}
		
	}

}











