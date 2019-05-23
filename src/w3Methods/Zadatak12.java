package w3Methods;

public class Zadatak12 {

	public static void main(String[] args) {
		
		matrica(12);
		
	}
	
	public static void matrica(int unos) {
				
		for(int i = 0; i < unos; i++) {
			for(int j = 0; j < unos; j++)
				System.out.print((int) (Math.random() + 0.5) + " ");
			 
			System.out.println();
		} 
		
	}

}
