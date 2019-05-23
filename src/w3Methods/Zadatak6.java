package w3Methods;

public class Zadatak6 {

	public static void main(String[] args) {

		System.out.println(zbirBrojeva(2885));
		
	}

	public static int zbirBrojeva(int unos) {
		
		int zbir = 0;
		
		while(unos > 0) {
			zbir += unos % 10;
			unos /= 10;
		}
		
		return zbir;
		
	}
	
}
