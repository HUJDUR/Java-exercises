package bootcamp2;

public class Zadatak3 {
	
	public static void main(String[] args) {
		
		int broj = 55784; // unos korisnika
		
		while (broj > 0) {
			System.out.print(broj % 10 + " "); // uneseni broj ispisuje naopako
			broj /= 10;
		}
	
	}
}
