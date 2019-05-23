package ismijevTestZadatak5;

import java.util.ArrayList;

public class MyArray {
	
	// stanje objekta
	ArrayList<Integer> myArray = new ArrayList<>();
	
	// konstruktori
	public MyArray(ArrayList<Integer> myArray) {
		this.myArray = myArray;
	}

	// ponasanje objekta
	public int getSmallestElement() {
		int najmanjiElement = myArray.get(0);
		for (int i = 0; i < myArray.size(); i++) {
			if (myArray.get(i) < najmanjiElement)
				najmanjiElement = myArray.get(i);
		}
		return najmanjiElement;
	}
	
	public int getLargestElement() {
		int najveciElement = myArray.get(0);
		for (int i = 0; i < myArray.size(); i++) {
			if (myArray.get(i) > najveciElement)
				najveciElement = myArray.get(i);
		}
		return najveciElement;
	}
	
	public int sumAllElements() {
		int suma = 0;
		for (int i = 0; i < myArray.size(); i++) 
			suma += myArray.get(i);
		return suma;
	}
	
	public void printAllElements() {
		for (int i = 0; i < myArray.size(); i++) 
			System.out.print(myArray.get(i) + " ");
		
	}
	
}
