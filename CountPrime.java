import java.util.*;
class CountPrime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n,flag=0;
		System.out.print("Enter elements:");
		n=sc.nextInt();
		for(int j=2;j<=n;j++) {
			int count=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0)
					count+=1;
			}
			if(count==2)
				flag+=1;
		}
		System.out.println("Prime count:" +flag);
	}
}