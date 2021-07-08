import java.util.*;
class PlusOne {
    public static int[] plusOne(int[] digits) {
        
        if(digits == null || digits.length == 0){
            int[] temp={1};
            return temp;
        }
        
        int carry=1;
        int i;
        for( i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                carry+=digits[i];
                digits[i]=carry;
                break;
            }
        }
        if(i<0){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result; 
        }else
            return digits;
    }
    public static void main(String[] args)  {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size:");
	n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter array");
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	plusOne(arr);
	System.out.print("Incremented Array:");
	for(int i = 0; i < n; i++) {
		System.out.print(arr[i]);
	}
     }
}