package bootcamp4;

public class Zadatak2 {

	public static void main(String[] args) {
		
		String recenica = "AsadNUBCIA";
		int brojac = 0;
		
		for (int i = 0; i < recenica.length(); i++) {
			if (Character.isUpperCase(recenica.charAt(i)))
				brojac++;
		}
		
		System.out.println("Broj velikih slova u stringu je: " + brojac);
		
	}

}
