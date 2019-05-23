package zadaca3;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva broja:");
		int broj1 = input.nextInt();
		int broj2 = input.nextInt();
		input.close();
		
		int najmanjiZajednicki = 2;
		
		while(najmanjiZajednicki < broj1 && najmanjiZajednicki < broj2) {
			if(broj1 % najmanjiZajednicki != 0 || broj2 % najmanjiZajednicki != 0)
				najmanjiZajednicki++;
		}
		
		System.out.println("Najmanji zajednicki je: " + najmanjiZajednicki);
		
	}

}
