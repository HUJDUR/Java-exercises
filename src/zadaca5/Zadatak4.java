package zadaca5;

public class Zadatak4 {

	public static void main(String[] args) {
		 
		int broj1 = 15;
		int broj2 = 45;
		int najveciBroj;
		if(broj1 > broj2) 
			najveciBroj = broj1;
		else
			najveciBroj = broj2;
		
		int najmanjiZajednicki = 2;
		int najveciZajednicki = 3;
		
		while(najmanjiZajednicki <= najveciBroj) {
			if(broj1 % najmanjiZajednicki == 0 && broj2 % najmanjiZajednicki == 0) {
				System.out.println("Najmanji zajednicki je: " + najmanjiZajednicki);
				break;
			} else
				najmanjiZajednicki++;
		}
		
		while(najveciBroj > 0) {
			if(broj1 % najveciBroj == 0 && broj2 % najveciBroj == 0) {
				najveciZajednicki = najveciBroj;
				break;
			} else
				najveciBroj--;
		}
 		
		System.out.println("Najveci zajednicki je: " + najveciZajednicki);
	
	}

}
