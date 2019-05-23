package bootcamp8;

public class Zadatak3 {

	public static void main(String[] args) {
		
		System.out.println(prebrojiSlova("adas"));
		
	}
	
	public static int prebrojiSlova(String s) {
		
		int brojac = 0;
		
		for (int i = 0; i < s.length(); i++) 
			brojac++;
		
		return brojac;
	}
	
}
