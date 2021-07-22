import java.util.*;
class DivUsingHMap {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		System.out.print("Enter no.of values:");
		int n = sc.nextInt();
		System.out.print("Enter the first divisor:");
		int first = sc.nextInt();
		System.out.print("Enter the second divisor:");
		int second = sc.nextInt();
		int count=0,flag=0;
		int keys[]=new int[n];
		System.out.println("Enter values:");
		for(int i=0; i<n; i++) {
			h1.put(sc.nextInt(),keys[i]);
		}
		for (Map.Entry<Integer,Integer> j : h1.entrySet()) {
			if(j.getKey()%first==0)    //{12,21,10,20,9,3,6,7,8,11}             
			  count+=1;                              
			if(j.getKey()%second==0)
			  flag+=1;
		}
		System.out.println(first+ " = " + count);  
		System.out.println(second+ " = " + flag);
	}
}