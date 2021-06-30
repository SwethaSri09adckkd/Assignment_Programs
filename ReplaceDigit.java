import java.util.*;
class ReplaceDigit
{
    static int replaceDigit(int n, int x, int y)
    {
        int res = 0, mul = 1;
        while (n / 10 > 0)
        {
            int rem = n % 10;
            if (rem == x)
                res = res + y * mul;
            else 
                res = res + rem * mul;
            mul *= 10;
            n = n / 10;
        }
        if (n == x)
            res = res + y * mul;
        else 
            res = res + n * mul;
        return res;
    }
    public static void main(String[] args)
    {
        int n,x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	n = sc.nextInt();
	System.out.println("Enter the digit to be replaced:");
	x = sc.nextInt();
	System.out.println("Enter the digit with which it gets replaced:");
	y = sc.nextInt();
        System.out.println(replaceDigit(n, x, y));
    }
}
 