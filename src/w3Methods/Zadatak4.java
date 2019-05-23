package w3Methods;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println(brojSamoglasnika("sdAfagiOn"));
		
	}

	public static int brojSamoglasnika(String unos) {
		
		int brojac = 0;
		
		for(int i = 0; i < unos.length(); i++) {
			if(unos.charAt(i) == 'a' || unos.charAt(i) == 'A' || unos.charAt(i) == 'e' || unos.charAt(i) == 'E' || unos.charAt(i) == 'i' || unos.charAt(i) == 'I' || unos.charAt(i) == 'o' || unos.charAt(i) == 'O' || unos.charAt(i) == 'u' || unos.charAt(i) == 'U')
				brojac++;
		}
		
		return brojac;
		
	}
	
}
