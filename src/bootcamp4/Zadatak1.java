package bootcamp4;

public class Zadatak1 {

	public static void main(String[] args) {
		
		String recenica = "To nije dobra ideja.";
		
		for (int i = 0; i < recenica.length(); i++) {
			if (recenica.charAt(i) == ' ' || recenica.charAt(i) == '.' || recenica.charAt(i) == ',') {
				System.out.println();
				continue;
			}
			System.out.print(recenica.charAt(i));
		}		
		
	}

}
