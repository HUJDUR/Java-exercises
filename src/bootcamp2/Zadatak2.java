package bootcamp2;

public class Zadatak2 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 1000; i++) { // ispis svih brojeva od 1 do 1000 koji su djeljivi sa 4 ali ne i sa 5
			if(i % 4 == 0 && i % 5 != 0)
				System.out.println(i);
		}
		
	}

}
