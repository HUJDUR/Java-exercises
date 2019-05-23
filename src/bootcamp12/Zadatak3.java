package bootcamp12;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int duzinaNiza = input.nextInt();
		int[] niz = new int[duzinaNiza];
		int zbir = 0;
		
		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < duzinaNiza; i++)
			niz[i] = input.nextInt();
		
		input.close();
		
		for (int i = 0; i < niz.length; i++)
			zbir += niz[i];
		
		System.out.println("Aritmeticka sredina niza je: " + (zbir / duzinaNiza));
	}

}
