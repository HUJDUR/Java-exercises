package bootcamp13;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite elemente niza:");
		
		int[] niz = new int[5];
		int brojacZaVece = 0;
		int brojacZaManje = 0;
		
		for (int i = 0; i < niz.length; i++)
			niz[i] = input.nextInt();
		input.close();
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < niz[0])
				brojacZaManje++;
			if (niz[i] > niz[4])
				brojacZaVece++;
		}
		
		System.out.printf("Od unesenih elemenata %d su manja od prvog unesenog elementa a %d je vece od zadnjeg!", brojacZaManje, brojacZaVece);
	
	}

}
