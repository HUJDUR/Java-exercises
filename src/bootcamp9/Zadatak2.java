package bootcamp9;

public class Zadatak2 {

	public static void main(String[] args) {
		
			System.out.println(ukloniKarakter("Vauuuhiuu", 'u'));
		
	}
	
	public static String ukloniKarakter(String str, char ch) {
		
		String kraj = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				continue;
			else
				kraj += str.charAt(i);
		}
		
		return kraj;
		
	}
	
}
