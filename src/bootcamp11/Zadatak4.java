package bootcamp11;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println((password("asdfghjk12") == true) ? "Password je validan" : "Paswword nije validan");
		
	}
	
	public static boolean password(String a) {
		
		boolean prvaProvjera;
		boolean drugaProvjera = true;;
		boolean trecaProvjera = true;
		int brojac = 0;
		
		// prva provjera
		
		if (a.length() >= 8)
			prvaProvjera = true;
		else
			prvaProvjera = false;
		
		// druga provjera
		
		for (int i = 0; i < a.length(); i++) {
			if (Character.isDigit(a.charAt(i)) == false && Character.isLetter(a.charAt(i)) == false) {
				drugaProvjera = false;
				break;
			}
		}
		
		// treca provjera
		
		for (int i = 0; i < a.length(); i++) {
			if (Character.isDigit(a.charAt(i)))
				brojac++;
		}
		
		if (brojac < 2)
			trecaProvjera = false;
		
		// glavna provjera koja vraca vrijednost
		
		if (prvaProvjera == false || drugaProvjera == false || trecaProvjera == false) 
			return false;
		else
			return true;
	}
	
}
