package bootcamp14;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int[] niz = {1, 2, 3, 4, 4, 4, 4, 5, 6};
		
		if (daLiSePonavlja(niz) == false) 
			System.out.println("U nizu se elementi ne ponavljaju 4 puta...");
		else 
			System.out.println("U nizu se ponavljaju 4 elementa!");
		
	}
	
	public static boolean daLiSePonavlja(int niz[]) {
		
		int bingo = 1;
		
		for (int i = 0; i < niz.length; i++) {
			
			for (int j = i + 1; j < niz.length; j++) {
				if (niz[i] == niz[j])
					bingo++;
			}
			if (bingo == 4) 
				break;
			else
				bingo = 1;
			
		}
		
		
		
		if (bingo == 4) 
			return true;
		else 
			return false;
		
	}

}
