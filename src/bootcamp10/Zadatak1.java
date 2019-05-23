package bootcamp10;

public class Zadatak1 {

	public static void main(String[] args) {
		
		prefiks("Dobrodosli na Java programiranje", "Dobrodosli na C++ programiranje");
		
	}
	
	public static void prefiks(String a, String b) {
		
		int duzina = (a.length() > b.length()) ? a.length() : b.length();
		int i = 0;
		
		do {
			if (a.charAt(0) != b.charAt(0)) {
				System.out.println("Nemaju zajednicki prefiks");
				break;
			} 
			if (a.charAt(i) == b.charAt(i)) {
				System.out.print(a.charAt(i));
				i++;
			} else
				break;
		} while (i < duzina);
		
	}
	
}
