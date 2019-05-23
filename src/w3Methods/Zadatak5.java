package w3Methods;

public class Zadatak5 {

	public static void main(String[] args) {
		
		System.out.println(brojRijeci("The quick brown fox jumps over the lazy dog."));
		
	}

	public static int brojRijeci(String unos) {
		
		int brojac = 0;
		
		for(int i = 0; i < unos.length(); i++) {
			if(unos.charAt(i) == ' ' || unos.charAt(i) == '.')
				brojac++;
		}
		
		return brojac;
		
	}
	
}
