package bootcamp16;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int[][] matricaRadnihSati = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}};
		int[] ukupanBrojSedmicnihSati = new int[7];
		
		int brojSati = 0;
		int najveciBrojSati = 0;
		int index = 0;
		
		for (int i = 0; i < matricaRadnihSati.length; i++) {
			for (int j = 0; j < matricaRadnihSati[i].length; j++)
				brojSati += matricaRadnihSati[i][j];
			ukupanBrojSedmicnihSati[i] = brojSati;
			brojSati = 0;
		}
		
		for (int i = 0; i < ukupanBrojSedmicnihSati.length; i++) {
			if (ukupanBrojSedmicnihSati[i] > najveciBrojSati) {
				najveciBrojSati = ukupanBrojSedmicnihSati[i];
				index = i;
			}
		}
		
		System.out.printf("Radnik sa brojem indexa %d ima najveci broj sati sa %d zavrsenih sati", index, najveciBrojSati);
		
		
		
	}

}
