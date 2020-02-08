package selectionsort;
import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {6, 3, 8, 9, 1, 2, 10, 7};
		/*[3, 6, 8, 1, 2, 9, 7, 10]
		  [3, 6, 1, 2, 8, 7, 9, 10]
		  [3, 1, 2, 6, 7, 8, 9, 10]
		  [1, 2, 3, 6, 7, 8, 9, 10]
		*/
		
		System.out.println(Arrays.toString(sort(array)));
	}
	
	private static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}			
		}
		return array;
	}

}
