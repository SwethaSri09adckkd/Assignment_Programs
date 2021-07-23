import java.util.*;
class RevUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        Stack st = new Stack<>();
	for(int i = 0; i < str.length(); i++) {
	    st.push(str.charAt(i));
	}   
        System.out.print("Reverse of a string:");
        while(!st.empty()) {
	    System.out.print(st.pop());
       }
   }
}