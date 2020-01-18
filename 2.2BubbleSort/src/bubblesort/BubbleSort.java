package bubblesort;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {98, 67, 41, 7, 18, 45, 9, 34};
		
		System.out.println(Arrays.toString(sort(array)));
	}

	private static int[] sort(int[] array) {
		boolean swapped = false;
		int n = array.length;
		
		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if(array[i] < array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					
					swapped = true;
				}
			}
		} while(swapped == true);
		
		return array;
	}
}
