package ismijevTestZadatak1;

public class Test {

	public static void main(String[] args) {
		
		Author autor = new Author("Ismail Brkic", "ismailbrkic@gmail.com", 'm');
		Book knjiga = new Book("Fizis", autor, 25, 1);
		
		System.out.println(knjiga.toString());
	}

}
