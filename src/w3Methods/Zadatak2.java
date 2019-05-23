package w3Methods;

public class Zadatak2 {

	public static void main(String[] args) {
		
		System.out.println(srednjaVrijendost(25, 45, 65));
		
	}

	public static int srednjaVrijendost(int prvi, int drugi, int treci) {
				
		int srednjaVrijednost = (prvi + drugi + treci) / 3;
		
		return srednjaVrijednost;
		
	}
	
}
