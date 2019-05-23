package bootcamp9;

public class Zadatak4 {

	public static void main(String[] args) {
		
		samoglasnikIliNe('/');
		
	}
	
	public static void samoglasnikIliNe (char a) {
		
		if (a == 'a' || a == 'e'|| a == 'i' || a == 'o' || a == 'u')
			System.out.println("Uneseni char je samoglasnik!");
		else if (Character.isLetter(a) == false)
			System.out.println("Pogresan unos!");
		else 
			System.out.println("Uneseni char je suglasnik");
	}

}
