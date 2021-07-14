import java.util.*;
class StringCompression { 
	static void compress(String str) 
	{ 
		int n = str.length(); 
		for (int i = 0; i < n; i++) { 
			int count = 1; 
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) { 
				count++; 
				i++; 
			} 
			if (count == 1) {
			  System.out.print(str.charAt(i) + "1"); 
      			} 
      			else {
			  System.out.print(str.charAt(i)); 
  			  System.out.print(count); 
      			}
		} 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = sc.nextLine(); 
		compress(str); 
	} 
} 