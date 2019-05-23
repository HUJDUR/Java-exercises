package w3Arrays;

import java.util.ArrayList;

public class Zadatak9 {

	public static void main(String[] args) {
		
		ArrayList <Integer> niz = new ArrayList<Integer>();
		
		for(int i = 0; i < 5; i++) 
			niz.add(0);
			
		//Scannerom preuzete
		int pozicija = 3;
		int vrijednost = 3;
	
		niz.add(pozicija - 1, vrijednost);
		
		System.out.println(niz);
		
		
	}

}
