package bootcamp16;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int[][] niz = {{1, 2, 3}, {9, 5, 6}, {7, 8, 5}};
		
		int[] rezultat = najveciElement(niz); 
		
		for (int i = 0; i < rezultat.length; i++)
			System.out.print(rezultat[i] + " ");
		
	}
	
	public static int[] najveciElement(int[][] niz) {
		
		int najveciBroj = 0;
		int[] rezultat = new int[2];
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz[i][j] > najveciBroj)
					najveciBroj = niz[i][j];
			}
		}
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if (niz[i][j] == najveciBroj) {
					rezultat[0] = i;
					rezultat[1] = j;
				}
			}
		}
		
		
		return rezultat;
	}
	
}
