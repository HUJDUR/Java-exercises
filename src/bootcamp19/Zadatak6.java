package bootcamp19;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string");
		String recenica = input.nextLine();
		input.close();
		int brojVelikih = 0;
		int brojMalih = 0;
		
		for (int i = 0; i < recenica.length(); i++) {
			if (Character.isUpperCase(recenica.charAt(i)))
				brojVelikih++;
			else 
				brojMalih++;
		}
		
		System.out.printf("Procenat velikih slova je %d, a procenat malih je %d", (brojVelikih * 100) / recenica.length(), (brojMalih * 100) / recenica.length());
	}

}
