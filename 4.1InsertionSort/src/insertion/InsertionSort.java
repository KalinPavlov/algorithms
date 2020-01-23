package insertion;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {45 , 67, 21, 13, 54, 99, 1, 3, 2, 77};
		
		System.out.println(Arrays.toString(sort(array)));
	}

	private static int[] sort(int[] array) {
		
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		
		return array;
	}
}
