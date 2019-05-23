package bootcamp2;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int broj = 10; // unos korisnika
		int sumaParnihBrojeva = 0;
		
		for (int i = 1; i <= broj; i++) {
			if (i % 2 == 0)
				sumaParnihBrojeva += i;
		}
		
		System.out.println("Suma parnih brojeva je: " + sumaParnihBrojeva);
		
	}

}
