package ismijevTestProceduralno;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> niz = new ArrayList<>();
		System.out.println("Unesite rijeci:");
		while (true) {
			String rijec = input.nextLine();
			if (rijec.equalsIgnoreCase("kraj"))
				break;
			niz.add(rijec);
		}
		input.close();
		
		for (int i = 0; i < niz.size(); i++) 
			System.out.print(niz.get(i) + " ");
		
	}

}
