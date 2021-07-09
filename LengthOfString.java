import java.util.*;
class LengthOfString {
	public static void main(String[] args) {
		String str;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		sc= new Scanner(System.in);
		System.out.print("Enter String: ");
		str = sc.nextLine();		
		for(int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) != ' ') {
			    count++;
			}
		}
		System.out.println("Length of string without spaces: " + count);
	}
}