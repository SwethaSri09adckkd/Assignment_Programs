import java.util.Scanner; 
class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : "); 
        String originalStr = sc.nextLine();
	System.out.print("Enter string to be inserted : "); 
        String toBeInserted = sc.nextLine();
	System.out.print("Enter position : "); 
        int position = sc.nextInt();	
        String words[] = originalStr.split(" ");
        String replacedString = "";
	for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            String replacedWord = "";
            for (int j = 0; j < word.length(); j++) {
		if (j == position-1){
		replacedWord += toBeInserted;	
	    	}
                replacedWord = replacedWord + word.charAt(j);
            }
            replacedString = replacedString + replacedWord + " ";
        }
        System.out.println("Replaced string : " + replacedString);
    }
}