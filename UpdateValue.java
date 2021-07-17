import java.util.*;
class UpdateValue{   
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n;
    ArrayList<Integer> al=new ArrayList<Integer>();
    System.out.print("Enter n value:");
    n=sc.nextInt(); 
    System.out.print("Enter " + n +" values:");
    for(int i=0; i<n; i++) {
	al.add(sc.nextInt());
    }
    System.out.print("Enter value in array:");
    int val=sc.nextInt();
    if(al.contains(val)) {
	System.out.print("Enter value to be updated:");
	int u=sc.nextInt();
	int v=al.indexOf(val);   
	al.remove(v);
	al.add(v,u);
	for(Integer i:al)
	System.out.print(i+" ");
    }
    else
	System.out.println("false");
  }
}
