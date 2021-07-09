import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        String str, rev_str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to check:");
     	str = sc.nextLine();
        int len = str.length();
       for(int k = len - 1; k >= 0; k--)
     {
          rev_str = rev_str + str.charAt(k);
      }
      if(str.equals(rev_str))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System. out.println("The string is not a palindrome.");
        }
    }
}