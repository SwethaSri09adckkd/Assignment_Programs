import java.util.*;
public class Count
{
  public static void main(String[] args){
  int n, product;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter array size:");
  n = sc.nextInt();
  int[]arr = new int[n];
  System.out.println("Enter array elements:");
  for(int i = 0; i < n; i++){
	arr[i] = sc.nextInt();
  }
  int count_odd =0, count_even = 0;
  for(int i = 0; i < n; i++){
	if(arr[i] % 2 == 1)
	  count_odd++;
	else
	  count_even++;
  }
  System.out.println("Odd: " + count_odd);
  System.out.println("Even: " + count_even);
  product = count_odd*count_even;
  if (product % 2 == 0)
	System.out.println("Product is even number");
  else
	System.out.println("Product is odd number");
  }
}