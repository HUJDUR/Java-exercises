package w3Arrays;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int[] niz = new int[5];
		
		int vrijednost = 0;
		
		for(int i = 0; i < niz.length; i++) {
			niz[i] = 2;
			vrijednost += niz[i];
		}
			
		System.out.println(vrijednost / niz.length);	
		
	}

}
