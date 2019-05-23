package bootcamp1;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int broj = 9; // unos korisnika
		int zbirParnih = 0; // sacuvat ce zbir svih parnih brojeva
		int brojac = 0; // broj parnih brojeva
		
		for (int i = 1; i <= broj; i++) {
			if (i % 2 == 0) {
				zbirParnih += i;
				brojac++;
			}
		}
		
		System.out.println("Zbir svih parnih brojeva je: " + zbirParnih + ", a prosjek unesenih brojeva je: " + (zbirParnih / brojac));
		
	}

}
