package search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {98, 67, 41, 7, 18, 45, 9, 34, 56, 1, 6, 3, 2, 77, 81};
		Arrays.sort(array);
		System.out.println("Sorted array: " + Arrays.toString(array));
		System.out.println(binarySearch(98, array, 0, array.length - 1));
	}
	
	private static boolean binarySearch(int item, int[] array, int low, int high) {
		
		if (low > high) {
			System.out.println("Not found");
			return false;
		}
		
		int mid = (low + high) / 2;
		
		if (item == array[mid]) {
			System.out.println("Item found");
			return true;
		} else if (item > array[mid]) {
			return binarySearch(item, array, mid + 1, high);
		} else {
			return binarySearch(item, array, low, mid - 1);
		}
	}

}
