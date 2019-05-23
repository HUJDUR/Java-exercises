package bootcamp13;

public class Zadatak5 {

	public static void main(String[] args) {
		
		int[] niz = generateArray();
		
		for (int i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " ");		
		
	}
	
	public  static  int[]  generateArray()  {
		 
		int[] niz = new int[10];
		
		for (int i = 0; i < niz.length; i++) {
			 
			int random = (int)(Math.random() * ((69 - 1) + 1)) + 1;
			
			niz[i] = random;
			
			for (int j = 0; j < niz.length; j++) {
				
				int random2 = (int)(Math.random() * ((69 - 1) + 1)) + 1;
				
				if (niz[j] == niz[i] && i != j)
					niz[i] = random2;
					
			}
			
		}
		
		return niz;
		
	}
	
}
