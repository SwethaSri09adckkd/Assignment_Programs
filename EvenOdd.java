import java.util.*; 
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : "); 
        String num = sc.nextLine();
        String digit[] = num.split("");
	int digits[] = new int[digit.length];
	for (int i = 0; i < digit.length; i++) 
        {
  	    digits[i] = Integer.parseInt(digit[i]);
        } 
        for (int i = 0; i < digits.length; i++) 
        {
  	    if(digits[i]%2 != 0)
		System.out.print(digits[i]);
        }
	System.out.print(" ");
	for (int i = 0; i < digits.length; i++) 
        {
  	    if(digits[i]%2 == 0)
		System.out.print(digits[i]);
        }
    }
}