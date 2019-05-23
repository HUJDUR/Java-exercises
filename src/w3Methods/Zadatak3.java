package w3Methods;

public class Zadatak3 {

	public static void main(String[] args) {
		
		srednjiKarakter("350");
		
	}

	public static void srednjiKarakter(String unos) {
		
		int duzina = unos.length();
		
		if(duzina % 2 == 0) 
			System.out.println(unos.charAt((duzina / 2 - 1)) + "" + unos.charAt(duzina / 2));
		 else {
			System.out.println(unos.charAt(duzina / 2));
		}
				
	}
	
	
}
