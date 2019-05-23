package bootcamp12;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] niz = new int[10];
		int zbir = 0;
		
		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < 10; i++)
			niz[i] = input.nextInt();
		
		input.close();
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > 0 && niz[i] % 3 == 0)
				zbir += niz[i];
		}
		
		System.out.println("Suma svih pozitivnih brojeva djeljivih sa 3 je: " + zbir);
		
	}

}
