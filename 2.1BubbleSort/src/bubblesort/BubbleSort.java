package bubblesort;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 23, 18, 1, 34, 100, 21, 2, 6, 3};
		
		System.out.println(Arrays.toString(sort(array)));
	}
	
	private static int[] sort(int[] array) {
		int n = array.length;
		
		for( int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		return array;
			
	}

}

/*
First pass
18 23 1 34 100 21 2 6 3 
18 1 23 34 100 21 2 6 3 
18 1 23 34 100 21 2 6 3 
18 1 23 34 100 21 2 6 3 
18 1 23 34 21 100 2 6 3 
18 1 23 34 21 2 100 6 3 
18 1 23 34 21 2 6 100 3 
18 1 23 34 21 2 6 3 100 

Second pass
1 18 23 34 21 2 6 3 100 
1 18 23 34 21 2 6 3 100 
1 18 23 34 21 2 6 3 100 
1 18 23 21 34 2 6 3 100 
1 18 23 21 2 34 6 3 100 
1 18 23 21 2 6 34 3 100 
1 18 23 21 2 6 3 34 100 

Third pass
1 18 23 21 2 6 3 34 100 
1 18 23 21 2 6 3 34 100 
1 18 21 23 2 6 3 34 100 
1 18 21 2 23 6 3 34 100 
1 18 21 2 6 23 3 34 100 
1 18 21 2 6 3 23 34 100 

Fourth pass
1 18 21 2 6 3 23 34 100 
1 18 21 2 6 3 23 34 100 
1 18 2 21 6 3 23 34 100 
1 18 2 6 21 3 23 34 100 
1 18 2 6 3 21 23 34 100 

Fifth
1 18 2 6 3 21 23 34 100 
1 2 18 6 3 21 23 34 100 
1 2 6 18 3 21 23 34 100 
1 2 6 3 18 21 23 34 100 

Sixth
1 2 6 3 18 21 23 34 100 
1 2 6 3 18 21 23 34 100 
1 2 3 6 18 21 23 34 100 

Seventh pass
1 2 3 6 18 21 23 34 100 
1 2 3 6 18 21 23 34 100 

Eighth pass
1 2 3 6 18 21 23 34 100 

*/