import java.util.*;
class CharSquare{
	public static void main(String args[]){
	  int n;
	  char[] x;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter n value");
	  n=sc.nextInt();
	  int size=2*n-1;
	  int start = 0;
	  int end = size-1;
	  char[][] a=new char[size][size];
	  System.out.println("Enter string");
	  x = sc.next().toCharArray();
	  int index=0;
	  while(n!=0){
		for( int i=start;i<=end;i++){
   		  for(int j=start; j<=end; j++){
    		    if(i==start|| i==end || j==start || j==end)
      			a[i][j] = x[index];
  		  }
		}
		++start;
		--end;
		--n;
		index++;
	  }
	  for(int i=0;i<size;i++){
   	   for(int j=0;j<size;j++)
    	     System.out.print(a[i][j]+"  ");
  	  System.out.println();
	  }
	}
}