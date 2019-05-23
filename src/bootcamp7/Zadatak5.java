package bootcamp7;

public class Zadatak5 {

	public static void main(String[] args) {
		
		String rijec = "AAAAmm";
		int brojacV = 0;
		int brojacM = 0;
		int procV;
		int procM;
		
		for (int i = 0; i < rijec.length(); i++) {
			if (Character.isUpperCase(rijec.charAt(i)))
				brojacV++;
			else
				brojacM++;
		}
		
		procV = (100 * brojacV) / rijec.length();
		procM = (100 * brojacM) / rijec.length();
		
		System.out.printf("Procenat velikih slova je: %d, a malih: %d", procV, procM);
		
	}

}
