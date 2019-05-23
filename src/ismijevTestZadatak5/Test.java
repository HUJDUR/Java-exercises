package ismijevTestZadatak5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> myArray = new ArrayList<>();
		myArray.add(2);
		myArray.add(5);
		myArray.add(1);
		myArray.add(3);
		
		MyArray array = new MyArray(myArray);
		System.out.println(array.getLargestElement());
		System.out.println(array.getSmallestElement());
		System.out.println(array.sumAllElements());
		array.printAllElements();
	
	}

}
