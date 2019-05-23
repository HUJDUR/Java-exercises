package bootcamp11;

public class Zadatak2 {

	public static void main(String[] args) {
		
		System.out.println("Obim kvadrata je " + obim(3.5));
		System.out.println("Povrsina kvadrata je " + povrsina(3.5));
	}
	
	public  static  double  obim(double  stranica) {
		double obim = 4 * stranica;
		
		return obim;
	}
	
	public static double povrsina(double stranica) {
		double povrsina = stranica * stranica;
		
		return povrsina;
	}
	
}
