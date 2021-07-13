import java.util.*;
class Factorial {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;  
        return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number:");
        int num = sc.nextInt();
        System.out.print("Factorial of " + num + " is ");
	System.out.println(factorial(num));
    }
}