package bootcamp18;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		ArrayList<Integer> niz = new ArrayList<>();
		System.out.println("Unesite brojeve u niz:");
		for (int i = 0; i < 100; i++) {
			int unos = input.nextInt();
			if (unos < 0)
				break;
			niz.add(unos);
		}
		input.close();
		
		int srednjaVrijednost = 0;
		for (int i = 0; i < niz.size(); i++) {
			srednjaVrijednost += niz.get(i);
		}
		srednjaVrijednost /= niz.size();
		
		int veceJednako = 0;
		int manje = 0;
		
		for (int i = 0; i < niz.size(); i++) {
			if (niz.get(i) >= srednjaVrijednost)
				veceJednako++;
			else
				manje++;
		}
		
		System.out.printf("Od unesenih brojeva %d je bilo vece ili jednako od srednje vrijednosti, a %d je bilo manje od srednje vrijednosti", veceJednako, manje);
		
	}

}
