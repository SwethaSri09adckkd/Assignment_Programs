import java.util.Scanner; 
class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : "); 
        String originalStr = sc.nextLine();
        String words[] = originalStr.split(" ");
        String reversedString = "";
	for (int i = words.length - 1; i >= 0; i--) { 
        reversedString += words[i] + " "; 
      	}
        System.out.print("Reversed string : " + reversedString);
    }
}