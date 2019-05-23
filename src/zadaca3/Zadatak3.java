package zadaca3;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brojeve:");
		int parni = 0;
		int neparni = 0;
		int broj = input.nextInt();
		
		do {
			broj = input.nextInt();
			if(broj % 2 == 0) 
				parni++;
			else
				neparni++;
		} while(broj != 0);
		input.close();
		
		
		System.out.printf("Unijeli ste %d parna i %d neparna", parni, neparni);
		
	}

}

