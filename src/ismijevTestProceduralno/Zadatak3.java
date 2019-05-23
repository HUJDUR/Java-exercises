package ismijevTestProceduralno;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu");
		String recenica = input.nextLine();
		input.close(); 
		
		String[] rijeci = recenica.split(" ");
		
		System.out.println(rijeci[rijeci.length-2]);
		
	}

}
