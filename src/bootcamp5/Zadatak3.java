package bootcamp5;

public class Zadatak3 {

	public static void main(String[] args) {
		
		String recenica1 = "ABCD";
		String recenica2 = "AC";
		int brojac = 0;
		
		for (int i = 0; i < recenica1.length(); i++) {
			for (int j = 0; j < recenica2.length(); j++) {
				if (recenica2.charAt(j) == recenica1.charAt(i))
					brojac++;
			}
		}
		
		if (brojac == recenica2.length())
			System.out.println("String 2 je substring stringa 1");
		else
			System.out.println("Uneseni string nije substring");
		
	}

}
