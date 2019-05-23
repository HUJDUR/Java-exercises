package zadaca5;

public class Zadatak6 {

	public static void main(String[] args) {
		
		int redovi = 7;
			
		for(int red = 1; red <= redovi; red++) {
			
			for(int i = 0; i < redovi - red; i++) 
				System.out.print(" ");
			
			for(int i = red; i >= 1; i--) 
				System.out.print(i);
			
			for(int i = 2; i <= red; i++) 
				System.out.print(i);
				
			
			System.out.println();
			
		}
		
	}

}
