package insertion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {45 , 67, 21, 13, 54, 99, 1, 3, 2, 77};
		/*[45, 67, 21, 13, 54, 99, 1, 3, 2, 77]
		  [21, 45, 67, 13, 54, 99, 1, 3, 2, 77]
		  [13, 21, 45, 67, 54, 99, 1, 3, 2, 77]
		  [13, 21, 45, 54, 67, 99, 1, 3, 2, 77]
		  [13, 21, 45, 54, 67, 99, 1, 3, 2, 77]
		  [1, 13, 21, 45, 54, 67, 99, 3, 2, 77]
		  [1, 3, 13, 21, 45, 54, 67, 99, 2, 77]
		  [1, 2, 3, 13, 21, 45, 54, 67, 99, 77]
		  [1, 2, 3, 13, 21, 45, 54, 67, 77, 99]
		*/
		System.out.println(Arrays.toString(sort(array)));
		double val = 0.1 + 0.2;
		System.out.printf("%.50f", val);
	}

	private static int[] sort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			System.out.println("Key: " + key);
			int j = i - 1;
			System.out.println("J: " + j);
			while(j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
			System.out.println(Arrays.toString(array));
		}
		
		return array;
	}
}
