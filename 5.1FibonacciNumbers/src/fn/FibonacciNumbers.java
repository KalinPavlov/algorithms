package fn;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int nthFibNum = 40;
		int res = 0;
		double startTime = System.currentTimeMillis();
		res = fibNumsRecurs(nthFibNum);
		System.out.println(res);
		double endTime = System.currentTimeMillis();
		System.out.println("Recurs fib took " + (endTime - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		res = fibNumsIter(nthFibNum);
		endTime = System.currentTimeMillis();
		System.out.println(res);
		System.out.println("Iter fib took " + (endTime - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		res = fibNumsArray(nthFibNum);
		endTime = System.currentTimeMillis();
		System.out.println(res);
		System.out.println("Array fib took " + (endTime - startTime) + "ms");
	}
	
	private static int fibNumsRecurs(final int n) {
		if (n <= 1) {
			return n;
		}
		return fibNumsRecurs(n - 1) + fibNumsRecurs(n - 2);
	}
	
	private static int fibNumsIter(final int n) {
		if (n <= 1) {
			return n;
		}
		
		int sum = 0;
		int n1 = 0;
		int n2 = 1;
		for(int i = 2; i <= n; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		return sum;
	}
	
	private static int fibNumsArray(int n) {
		
		if (n <= 1) {
			return n;
		}
		
		int[] array = new int[n + 1];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		
		return array[array.length - 1];
	}

}
