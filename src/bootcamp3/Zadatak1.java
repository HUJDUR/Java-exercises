package bootcamp3;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int broj1 = 15; // unos korisnika
		int broj2 = 5;  // unos korisnika
		int najmanji;
		if (broj1 > broj2)
			najmanji = broj2;
		else
			najmanji= broj1;
		
		System.out.println("Najmanji zajednicki sadrzilac je: ");
		
		for (int i = 2; i <= najmanji; i++) {
			if (broj1 % i == 0 && broj2 % i == 0)
				 System.out.print(i);
		}	
		
	}

}
