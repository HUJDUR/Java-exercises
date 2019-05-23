package zadaca5;

public class Zadatak5 {

	public static void main(String[] args) {
		
		double skolarina = 10000;
		double kamata = 0.05;
		
		int godina = (int) ((skolarina * kamata) + skolarina);
		System.out.println("Skolarina nakon godinu dana je " +  godina);
		
		int petGodina = (int) (5 * (skolarina * kamata) + skolarina);
		System.out.println("Skolarina nakon 5 godina je " + petGodina);
			
	}

}
