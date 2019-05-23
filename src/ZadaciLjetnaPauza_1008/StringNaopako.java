package ZadaciLjetnaPauza_1008;

import java.util.Scanner;

public class StringNaopako {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu:");
		String recenica = input.nextLine();
		input.close();		
		
		for(int i = recenica.length() - 1; i >= 0; i--) {
			System.out.print(recenica.charAt(i));
		}
		
	}

}
