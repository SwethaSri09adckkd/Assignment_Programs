import java.util.Scanner;
public class Automorphic
{
    static boolean isAutomorphic(int N)
    {
        int sq = N * N;
        while (N > 0) {
            if (N % 10 != sq % 10)
                return false;
            N /= 10;
            sq /= 10;
        }
        return true;
    }
    public static void main(String args[]) 
    {
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number:");
       num = sc.nextInt();
       System.out.println(isAutomorphic(num) ? "Automorphic" : "Not Automorphic");   
    }
}