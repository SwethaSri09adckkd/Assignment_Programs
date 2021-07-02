import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, i, j, flag, count=0;
        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt(); 
        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); 
        for (i = a; i <= b; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1; 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
		count++;
                //System.out.println(i);
        }
	System.out.println("Count of prime numbers:"+sum);
    }
}