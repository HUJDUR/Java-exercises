package bootcamp9;

public class Zadatak1 {

	public static void main(String[] args) {
		
		System.out.println(format(34, 1));
			
	}

	public static String format(int number, int width) {
		
		int stepen = 0;
		int j = number;
		String kraj = "";
		
		while (j > 0) {
			stepen++;
			j /= 10;
		}
		
		if (width > stepen) {
			for (int i = 0; i < width - stepen; i++) {
				kraj += "0";
			}
			kraj += number;
		
			return kraj;
		} else
			return number + "";
		
	}
	
}
