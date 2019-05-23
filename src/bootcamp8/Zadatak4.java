package bootcamp8;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println(brojacKaraktera("Dobro dosliiii", 'o'));
		
	}
	
	public static int brojacKaraktera(String str, char ch) {
		
		int brojac = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				brojac++;
		}
		
		return brojac;
	}

}
