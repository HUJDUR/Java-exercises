package ZadaciLjetnaPauza_1008;

public class CudanTrokut {

	public static void main(String[] args) {
	
		int redovi = 5;
		int brojevi = redovi;
		
		for(int i = 0; i < redovi; i++) {
			for(int j = 1; j <= brojevi; j++) {
				System.out.print(j + "    ");
			}
			brojevi -= 1;
			System.out.println();
		}
		
	}

}
