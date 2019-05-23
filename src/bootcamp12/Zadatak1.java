package bootcamp12;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[] niz = new int[10];
		int zbirParnih = 0;
		int zbirNeparnih = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite elemente u niz");
		
		for (int i = 0; i < niz.length; i++) 
			niz[i] = input.nextInt();
		
		input.close();
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0)
				zbirParnih += niz[i];
			else
				zbirNeparnih += niz[i];
		}

		System.out.printf("Zbir parnih elemenata niz je %d, a zbir neparnih elemenata je %d!", zbirParnih, zbirNeparnih);
		
	}

}
