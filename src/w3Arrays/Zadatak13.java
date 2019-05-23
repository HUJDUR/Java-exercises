package w3Arrays;

public class Zadatak13 {

	public static void main(String[] args) {
		
		String[] niz = {"aa", "cc", "bb", "cc", "bb"};
		
		for(int i = 0; i < niz.length - 1; i++) {
			for(int j = i + 1; j < niz.length; j++) {
				if(niz[i] == niz[j] && j != i)
					System.out.println("String koji se poavlja je: " + niz[i]);
			}
		}
		
	}

}
