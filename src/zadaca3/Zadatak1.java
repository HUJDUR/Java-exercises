package zadaca3;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int broj = 5;
		int faktorijal = 1;
		
		for(int i = broj; i > 0; i--) {
			faktorijal = faktorijal * i;
		}
		
		System.out.println(faktorijal);
		
	}

}
