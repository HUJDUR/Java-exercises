package bootcamp15;

public class Zadatak3 {

	public static void main(String[] args) {
		
		double[][] niz = {{1, 2, 3, 4.0}, {5, 6.5, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		
		System.out.println(sumirajSilaznuDijagonalu(niz));
		
	}
	
	public static double sumirajSilaznuDijagonalu(double[][] niz) {
		
		double suma = 0;
		
		for (int i = 0; i < niz.length; i++) 
				suma += niz[i][i];
		
		return suma;
		
	}
	
}
