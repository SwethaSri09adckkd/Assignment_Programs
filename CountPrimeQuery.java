import java.io.*;
import java.util.*;

public class CountPrimeQuery {
    static final int MAX = 10000;
    static int prefix[] = new int[MAX + 1]; 
    static void buildPrefix() {
    boolean prime[] = new boolean[MAX + 1];
    Arrays.fill(prime, true); 
    for (int p = 2; p * p <= MAX; p++) {
    if (prime[p] == true) {
        for (int i = p * 2; i <= MAX; i += p)
        prime[i] = false;
    }
    }
    prefix[0] = prefix[1] = 0;
    for (int p = 2; p <= MAX; p++) {
    prefix[p] = prefix[p - 1];
    if (prime[p])
        prefix[p]++;
    }
} 
static int query(int L, int R)
{
    return prefix[R] - prefix[L - 1];
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        buildPrefix();
        int L,R,n;
        n = sc.nextInt(); 
        L = sc.nextInt();
        R = sc.nextInt();
        for(int i=1; i<n; i++)
            
            System.out.println(query(L, R));
    }
}
