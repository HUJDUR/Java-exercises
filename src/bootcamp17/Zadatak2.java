package bootcamp17;

public class Zadatak2 {

	public static void main(String[] args) {
		
		double[][] niz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		double[][] niz2 = {{0, 2, 4}, {1, 4.5, 2.2}, {1.1, 4.3, 5.2}};
		
		saberiMatrice(niz1, niz2);
	}
	
	public static void saberiMatrice(double[][] a, double[][] b) {
		
		double[][] rezultat = new double[3][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
				rezultat[i][j] = a[i][j] + b[i][j];
		} 
		
		for (int i = 0; i < rezultat.length; i++) {
			for (int j = 0; j < rezultat[i].length; j++) 
				System.out.print(rezultat[i][j] + " ");
			System.out.println();
		}
	}
	
}
