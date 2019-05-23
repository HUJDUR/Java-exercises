package w3Arrays;

public class Zadatak14 {

	public static void main(String[] args) {
		
		String[] niz = {"as", "jy", "po", "klop"};
		String[] niz2 = {"klo", "qw", "jy"};
				
		for(int i = 0; i < niz.length; i++) {
			for(int j = 0; j < niz2.length; j++) {
				if(niz[i] ==  niz2[j])
					System.out.println(niz[i]);
			}
		}
				
	}

}
