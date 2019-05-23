package bootcamp12;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int[] niz = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite elemente u niz:");
		
		for (int i = 0; i < niz.length; i++) 
			niz[i] = input.nextInt();
		
		input.close();
		
		System.out.println("Najmanji element na neparnim pozicijama je: " + najmanjiNeparniElement(niz));
		
	}
	
	public static int najmanjiNeparniElement(int[] niz) {
		
		int najmanji = 2147483647;
		
		for (int i = 0; i < niz.length; i += 2) {
			if (niz[i] < najmanji)
				najmanji = niz[i];
		}
			
		return najmanji;
		
	}
	
}
