package bootcamp11;

public class Zadatak5 {

	public static void main(String[] args) {
		
		generateArray();
		
	}

	public static int[] generateArray() {
		
		int[] niz = new int[10];
		
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * ((10 - 1) + 1)) + 1;
			System.out.print(niz[i] + " ");
		}
		
		return niz;
	}

}
