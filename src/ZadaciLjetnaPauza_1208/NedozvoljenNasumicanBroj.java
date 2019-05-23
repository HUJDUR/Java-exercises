package ZadaciLjetnaPauza_1208;

import java.util.Random;
import java.util.Scanner;

public class NedozvoljenNasumicanBroj {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj koji se ne smije generisati:");
		int nedozvoljenBroj = input.nextInt();
		input.close();
		
		int ran;
		
		do {
			ran = random.nextInt(54) + 1;
			
		} while(ran == nedozvoljenBroj);
		
		System.out.println(ran);
		
	}

}
