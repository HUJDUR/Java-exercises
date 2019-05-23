package bootcamp12;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// umijesto 100 clanova bit ce 5 koje korisnik unese i tek onda printa najvecu vrijednost i index

		Scanner input = new Scanner(System.in);
		int[] niz = new int[5];
		int najveciBroj = 0;
		int index = 0;
		
		System.out.println("Uneiste clanove niza: ");
		for (int i = 0; i < niz.length; i++) 
			niz[i] = input.nextInt();
		input.close();
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > najveciBroj) {
				najveciBroj = niz[i];
				index = i;
			}
		}
			
		System.out.printf("Najveci broj u nizu je %d i ima index broj %d", najveciBroj, index);
		
		
		
		
	}

}
