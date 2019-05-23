package bootcamp17;

import java.util.Arrays;

public class Zadatak1 {

	public static void main(String[] args) {
		
		int[] niz = {3, 9, 4, 6, 2, 5};
		bubbleSort(niz);
		
	}
	
	public static void bubbleSort(int[] array) {
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
	}
	
}

