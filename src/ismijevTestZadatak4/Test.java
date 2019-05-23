package ismijevTestZadatak4;

public class Test {

	public static void main(String[] args) {
		
		Racunar racunar = new Racunar(8, 120, 3, 17, 350);
		Laptop laptop = new Laptop(8, 120, 3, 17, 350, 5);
		
		System.out.println(racunar.izracunajCijenu());
		System.out.println(laptop.izracunajCijenu());
		
	}

}
