import java.util.*;
class CountFact {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int zeroes = 0;
		int repeat = (int) (Math.log(n) / Math.log(5));
		for(int i = 1; i <= repeat; i++) {
			zeroes += n / Math.pow(5, i);
		}
		System.out.println("Factorial=" +zeroes);
	}
}