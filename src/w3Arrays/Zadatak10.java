package w3Arrays;

public class Zadatak10 {

	public static void main(String[] args) {
		
		int[] niz = {15, 199, 2, 78};
		
		int najveci = 0;
		int najmanji = niz[0];
		
		for(int i = 0; i < niz.length; i++) {
			if(niz[i] > najveci)
				najveci = niz[i];
			if(niz[i] < najmanji)
				najmanji = niz[i];
		}
		
		System.out.println(najveci + " " + najmanji);	
		
	}

}
