import java.util.*;
class SubAndProSum {
    public static void main(String[] args){
        int n,rem = 0, sum = 0, pro = 1;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
        while(n > 0){  
            rem = n%10;  
            sum = sum + rem;  
            pro = pro * rem;
            n = n/10;  
        }
        System.out.println(pro-sum);
    }
}