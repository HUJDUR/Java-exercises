package bootcamp9;

public class Zadatak5 {

	public static void main(String[] args) {
		
		intNaopako(987654321);
		
	}
	
	public static void intNaopako(int a) {
		
		String toString = a + "";
		
		for (int i = toString.length() - 1; i >= 0; i--) 
			System.out.print(toString.charAt(i));
			
	}
	
}
