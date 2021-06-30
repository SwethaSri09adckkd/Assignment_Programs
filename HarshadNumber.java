import java.util.*;
public class HarshadNumber  
{  
    public static void main(String[] args) {  
        int num, rem = 0, sum = 0, n; 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number:");
	num = sc.nextInt();   
        n = num;  
        while(num > 0){  
            rem = num%10;  
            sum = sum + rem;  
            num = num/10;  
        }   
        if(n%sum == 0)  
            System.out.println(n + " is a harshad number");  
        else  
            System.out.println(n + " is not a harshad number");  
    }  
}  