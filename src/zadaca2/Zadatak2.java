package zadaca2;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijenu artikla:");
		int cijenaArtikla = input.nextInt();
		System.out.println("Unesite popust u procentima:");
		double procenti = input.nextInt();
		input.close();
		
		System.out.println("Cijena sa popustom je: " + (int)((procenti / 100) * cijenaArtikla));
		
	}

}
