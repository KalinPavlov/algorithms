package gcd;

public class GCD {

	public static void main(String[] args) {
		System.out.println("GCD: " + gcdEuclideanAlgorithmRecurs(18, 84));
		
		System.out.println("LCM: " + leastCommonMultiple(18, 84));
	}
	
	private static int gcdEuclideanAlgorithmRecurs(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcdEuclideanAlgorithmRecurs(b, a%b);
	}
	
	private static int leastCommonMultiple(int a, int b) {
		return (a * b)/gcdEuclideanAlgorithmRecurs(6, 8); 
	}
	
}
