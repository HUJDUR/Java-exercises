package ZadaciLjetnaPauza_1008;

import java.util.Scanner;

public class BrojVelikihSlova {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu:");
		String recenica = input.nextLine();
		input.close();	
		
		int brojac = 0;
		
		for(int i = 0; i < recenica.length(); i++) {
			if (Character.isUpperCase(recenica.charAt(i))) 
				brojac++;
		}
		
		System.out.println(brojac);
		
	}

}
