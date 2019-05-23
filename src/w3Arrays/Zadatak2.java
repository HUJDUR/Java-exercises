package w3Arrays;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int[] niz = new int[5];
		
		int zbir = 0;
		
		for(int i = 0; i < niz.length; i++) {
			niz[i] = 2;
			zbir += niz[i];
		}
		
		System.out.println(zbir);
		
	}

}
