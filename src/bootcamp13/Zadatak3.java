package bootcamp13;

public class Zadatak3 {

	public static void main(String[] args) {
		
		for (int red = 1; red <= 10; red++) {
			for (int i = red; i < 10; i++)
				System.out.print(" ");
			
			for (int j = 1; j <= red; j++) 
				System.out.print(j);
			
			for (int k = 1; k < red; k++)	
				System.out.print(k);
			
			System.out.println();
		}
		
	}

}
