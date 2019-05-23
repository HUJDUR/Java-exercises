package bootcamp1;

public class Zadatak5 {

	public static void main(String[] args) {
		
		int broj = 19603548; // unos korisnika
		int zbir = 0; 
		
		if (broj > 1) {
			while (broj > 0) {
				zbir += broj % 10;
				broj /= 10;
			}
			System.out.println("Zbir cifara unesenog broja je: " + zbir);
			
		} else 
			System.out.println("Unesite pozitivan broj!");

	}

}
