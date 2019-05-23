package bootcamp16;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[] niz = {1, 2, 3, 4};
		System.out.println((isSortiran(niz) == true ? "Niz je sortiran!" : "Niz nije sortiran..."));
		
	}
	
	public static boolean isSortiran(int[] niz) {
		
		int najmanji = 0;
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] > najmanji)
				najmanji = niz[i];
			else 
				return false;	
		}
		
		return true;
		
	}
	
}
