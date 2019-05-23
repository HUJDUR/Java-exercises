package zadaca5;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cifre:");
		int broj = input.nextInt();
		int najveciBroj = broj;
		int brojac = 0;
		
		do {
			broj = input.nextInt();
			if (broj > najveciBroj) 
				najveciBroj = broj;
			
			if(broj == najveciBroj)
				brojac++;
		} while(broj > 0);
		input.close();
		
		System.out.printf("Broj %d je najveci i unijeli ste ga %d puta", najveciBroj, brojac);
		
	}

}
