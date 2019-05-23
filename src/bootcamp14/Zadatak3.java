package bootcamp14;

public class Zadatak3 {

	public static void main(String[] args) {
		
		// pozivanje metode
		int[] niz = {1, -20, 27, 8, -40, 3, 16};
		System.out.println("Najveci elemnent u nizu po apsolutnoj vrijednosti je: " + max(niz));
		
	}
	
	public static int max (int[] array) {
		
		int najveci = 0;
		
		// pretvaranje negativnih elemenata u pozitivne
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0)
				array[i] *= -1;
		}
	
		// potraga za najvecim elementom
		for (int i = 0; i < array.length; i++) {
			if (array[i] > najveci)
				najveci = array[i];
		}
			
		return najveci;
		
	}
	
}
