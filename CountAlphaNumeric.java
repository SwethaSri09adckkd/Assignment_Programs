import java.util.*;
public class CountAlphaNumeric {
	public static void main(String[] args) {
		String str;
		int i, alpha = 0, digit = 0, spl = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		sc= new Scanner(System.in);
		System.out.print("\nEnter Alpha Numeric Special String: ");
		str = sc.nextLine();		
		for(i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alpha++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit++;
			}
			else {
				spl++;
			}
		}
		if((alpha==digit) && (digit==spl))
		{
			System.out.println("Yes");		
		}
		else {
			System.out.println("No");
		}
	}
}