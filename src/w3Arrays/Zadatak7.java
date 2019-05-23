package w3Arrays;

import java.util.Arrays;

public class Zadatak7 {

	public static void main(String[] args) {
		
		int[] niz = {2, 3, 4};
		
		int index = 1;
		
		for(int i = index; i < niz.length -1; i++)
	        niz[i] = niz[i + 1];
		
		System.out.println(Arrays.toString(niz));
		
	}

}
