package ZadaciLjetnaPauza_1208;

public class UzastopniIstiElementiNiza {

	public static void main(String[] args) {
		
		int niz[] = new int[4];
		
		for(int i = 0; i < 4; i++) 
			niz[i] = 1;
		
		if(uzastopniElementi(niz))
			System.out.println("4 elementa se ponavljaju!");
		else
			System.out.println("4 elementa se ne ponavljaju");
		
	}
	
	public static boolean uzastopniElementi(int niz[]) {
		
		int i = 0;
		
		if(niz[i] == niz[i+1] && niz[i+1] == niz[i+2] && niz[i+2] == niz[i+3])
			return true;
		else
			return false;
	}

}
