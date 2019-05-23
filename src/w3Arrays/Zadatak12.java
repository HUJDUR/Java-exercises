package w3Arrays;

public class Zadatak12 {

	public static void main(String[] args) {
		
		int[] niz = {0, 2, 3, 3, 4, 4};
				
		for(int i = 0; i < niz.length - 1; i++) {
			for(int j = i + 1; j < niz.length; j++) {
				if(niz[i] == niz[j] && j != i)
					System.out.println("Broj koji se poavlja je: " + niz[i]);
			}
		}
		
	}

}
