package bootcamp14;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int[] niz = new int[20];
		int brojacZaJednocifrene = 0;
		int brojacZaDvocifrene = 0;
		int brojacZaTrocifrene = 0;
		int brojac1 = -1;
		int brojac2 = -1;
		int brojac3 = -1;
		
		for (int i = 0; i < niz.length; i++) 
			niz[i] = (int)(Math.random() * ((999 - 0) + 1)) + 0;
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < 10)
				brojacZaJednocifrene++;
			else if (niz[i] < 100)
				brojacZaDvocifrene++;
			else
				brojacZaTrocifrene++;
		}
		
		int[] nizJednocifrenih = new int[brojacZaJednocifrene];
		int[] nizDvocifrenih = new int[brojacZaDvocifrene];
		int[] nizTrocifrenih = new int [brojacZaTrocifrene];
		
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < 10) {
				brojac1++;
				nizJednocifrenih[brojac1] = niz[i];
			}
			else if (niz[i] < 100) {
				brojac2++;
				nizDvocifrenih[brojac2] = niz[i];
			}
			else {
				brojac3++;
				nizTrocifrenih[brojac3] = niz[i];
			}
		}
			
		for (int i = 0; i < nizJednocifrenih.length; i++)
			System.out.print(nizJednocifrenih[i] + " ");
		System.out.println();
		
		for (int i = 0; i < nizDvocifrenih.length; i++)
			System.out.print(nizDvocifrenih[i] + " ");
		System.out.println();
		
		for (int i = 0; i < nizTrocifrenih.length; i++)
			System.out.print(nizTrocifrenih[i] + " ");
		
	}

}
