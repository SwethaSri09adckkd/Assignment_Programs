import java.util.*; 
import java.math.*;
class CountTwinPrime{
	public static void main(String[] args) {
	final int[] d = { 2, 4, 0 };
	try (final Scanner in = new Scanner(System.in)) {
		System.out.print("Enter range:");
		final int n = in.nextInt() | 1;
        	final int m = in.nextInt();
        	int count = n <= 3 && 5 <= m ? 1 : 0;
        	final int odd1 = n + d[n % 3];
        	final int max = m % 2 == 0 ? m - 3 : m - 2;	
        	for (int i = odd1; i <= max; i += 6) {
			boolean p1 = BigInteger.valueOf(i).isProbablePrime(30);
	        	boolean p2 = BigInteger.valueOf(i + 2).isProbablePrime(30);
	        	if (p1 && p2) {
	          	count++;
	        	}
        	}
        	System.out.println("No. of twin primes:" + count);
	}
  	}
}