import java.util.*;
public class RemoveArrayList{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter n value:");
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  ArrayList<Integer> al = new ArrayList<Integer>();
	  System.out.println("Enter values into arraylist:");
	  for(int i=0;i<n;i++) {
		al.add(sc.nextInt());
	  }
	  System.out.print("Enter k value:");
	  int Q = sc.nextInt();
	  Iterator<Integer> z = al.iterator();
	  while(z.hasNext()) {
		int x = z.next();
		if(x <= Q)
		  z.remove();
		else                                
		  System.out.print(x+" ");
	  }
	}
}