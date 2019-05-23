package bootcamp6;

public class Zadatak2 {

	public static void main(String[] args) {
		
		String recenica = "hjcnsnfoaiuno";
		String samoglasnici = "aeiou";
		int brojac = 0;
		
		for (int i = 0; i < recenica.length(); i++) {
			for (int j = 0; j < samoglasnici.length(); j++) {
				if (recenica.charAt(i) == samoglasnici.charAt(j))
				brojac++;
			}
		}
		
		System.out.printf("U datoj recenici je %d samoglasnika i %d suglasnika", brojac, recenica.length() - brojac);
		
	}

}
