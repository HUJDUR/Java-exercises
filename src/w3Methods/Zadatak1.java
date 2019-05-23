package w3Methods;

public class Zadatak1 {

	public static void main(String[] args) {
		
		System.out.println(najveciBroj(12, 6, 2));
		
	}

	public static int najveciBroj(int prvi, int drugi, int treci) {
		
		int[] niz = {prvi, drugi, treci};
		
		int najveci = 0;
		
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] > najveci)
				najveci = niz[i];
		}
		
		return najveci;
		
	}
	
	
	
}
