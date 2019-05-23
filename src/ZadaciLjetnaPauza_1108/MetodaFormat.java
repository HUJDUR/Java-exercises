package ZadaciLjetnaPauza_1108;

public class MetodaFormat {

	public static void main(String[] args) {
		
		System.out.println(format(24, 4));
		
	}
	
	public static String format(int number, int width) {
		
		String broj="";
		String nule="";
		broj+=number;
		
		if(broj.length() < width){
			for(int i=0; i < width - broj.length(); i++)
			nule = nule + 0;
		}
		broj = nule + broj;
		return broj;	
	}

}
