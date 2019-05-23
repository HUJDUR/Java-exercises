package bootcamp10;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		System.out.println((kamenPapirMakaze() == false) ? "\n\nPobjedili ste kompjuter!" : "\n\nIzgubili ste od kompjutera...");
		
	}

	public static boolean kamenPapirMakaze() {
		Scanner input = new Scanner(System.in);
		int brojacKorisnika = 0;
		int brojacKompjutera = 0;
		
		System.out.println("KAMEN-PAPIR-MAKAZE\n1 - Kamen, 2 - Papir, 3 - Makaze");
		
		while (brojacKompjutera - brojacKorisnika <= 1 && brojacKorisnika - brojacKompjutera <= 1) {
			
			int kompjuter = (int)(Math.random() * ((3 - 1) + 1)) + 1;

			int korisnik = input.nextInt();
			
			if (kompjuter == 1) {
				if (korisnik == 2) {
					System.out.println("Pobjedili ste, kompjuter je igrao kamen!");
					brojacKorisnika++;
				} else if (korisnik == 3) {
					System.out.println("Izgubili ste, kompjuter je igrao kamen...");
					brojacKompjutera++;
				} else {
					System.out.println("Nerijeseno!");
					brojacKompjutera++;
					brojacKorisnika++;
				}
			} else if (kompjuter == 2) {
				if (korisnik == 1) {
					System.out.println("Izgubili ste, kompjuter je igrao papir...");
					brojacKompjutera++;
				} else if (korisnik == 3) {
					System.out.println("Pobjedili ste, kompjuter je igrao papir!");
					brojacKorisnika++;	
				} else {
					System.out.println("Nerijeseno!");
					brojacKompjutera++;
					brojacKorisnika++;
				}
			} else if (kompjuter == 3) {
				if (korisnik == 1) {
					System.out.println("Pobjedili ste, kompjuter je igrao makaze");
					brojacKorisnika++;
				} else if (korisnik == 2) {
					System.out.println("Izgubili ste, kompjuter je igrao makaze");
					brojacKompjutera++;
				} else {
					System.out.println("Nerijeseno!");
					brojacKompjutera++;
					brojacKorisnika++;
				}
			}
		}
		
		input.close();
		
		if(brojacKompjutera > brojacKorisnika)
			return true;
		else 
			return false;
		
	}
	
}
