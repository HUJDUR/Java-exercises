package bootcamp9;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int broj = 3;
		int brojTacnih = nasumicnaPitanja(broj);
		
		System.out.printf("Odgovorili ste na %d tacna/tacnih pitanja i imali ste %d netacna!", brojTacnih, broj - brojTacnih);
		
	}
	
	public static int nasumicnaPitanja(int brojPitanja) {
		
		Scanner input = new Scanner(System.in);
		int brojac = 0;
		
		for (int i = 0; i < brojPitanja; i++) {
			
			int nasumican1 = (int)(Math.random() * ((10 - 1) + 1)) + 1;
			int nasumican2 = (int)(Math.random() * ((10 - 1) + 1)) + 1;
			
			System.out.printf("%d - %d = ?\n", nasumican1, nasumican2);
			int unos = input.nextInt();
			
			if (unos == nasumican1 - nasumican2)
				brojac++;
		
		}
		
		input.close();
		return brojac;
		
		
	}

}
