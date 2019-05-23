package ZadaciLjetnaPauza_1008;

import java.util.Scanner;

public class SuglasnikIliSamoglasnik {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu:");
		String recenica = input.nextLine();
		char slovo = recenica.charAt(0);
		input.close();	
		
		if(slovo == 'A' || slovo == 'a' || slovo == 'E' || slovo == 'e' || slovo == 'I' || slovo == 'i' || slovo == 'O' || slovo == 'o')
			System.out.println("Samoglasnik");
		else
			System.out.println("Suglasnik");
		
		
	}

}
