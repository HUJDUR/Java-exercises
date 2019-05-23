package bootcamp15;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[] niz = new int[100000];
		
		for (int i = 0; i < niz.length; i++)
			niz[i] = (int)(Math.random() * ((100 - 0) + 1));

		long pocetakMjerenja = System.currentTimeMillis();
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == 50)
				System.out.println("Broj se nalazi na lokaciji " + i);
		}
		
		long krajMjerenja = System.currentTimeMillis();
		long ukupnoVrijeme = krajMjerenja - pocetakMjerenja;

		System.out.println("\nUkupno trajanje pretrazivanje je " + ukupnoVrijeme);
		
	}

}



