package bootcamp7;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int number;
		int ostatak;
		int suma = 1;
		
		for (int i = 0; i < 1000; i++) {
			number = i;
			
			if (i < 10)
				suma = number * number * number;
			else if (i > 9 && i < 100) {
				ostatak = number % 10;
				suma = ostatak * ostatak * ostatak;
				number /= 10;
				ostatak = number % 10;
				suma += ostatak * ostatak * ostatak;
			} else if (i > 100 && i < 1000) {
				ostatak = number % 10;
				suma = ostatak * ostatak * ostatak;
				number /= 10;
				ostatak = number % 10;
				suma += ostatak * ostatak * ostatak;
				number /= 10;
				ostatak = number % 10;
				suma += ostatak * ostatak * ostatak;	 
			}	
			
			if (suma == i) 
				System.out.println(i);			
			
		}
		
	}

}
