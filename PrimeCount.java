import java.util.*;
public class PrimeCount
{
  public static void main(String[] args){
  int n, count=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter array size:");
  n = sc.nextInt();
  int[]arr = new int[n];
  System.out.println("Enter array elements:");
  for(int i = 0; i < n; i++){
	arr[i] = sc.nextInt();
  }
  for(int i = 0; i < n; i++){
	 if(arr[i]==0||arr[i]==1)
		continue;
	 else{
		for(int j=2;j<=i;j++){      
    		  if(arr[i]%j!=0)
			count++;
		}
	}
  }
  System.out.println("Count of prime numbers " + count);
  }
}