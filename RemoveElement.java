import java.util.*; 
class RemoveElement {
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    int n;
    LinkedList<Integer> ll=new LinkedList<Integer>();
    System.out.print("Enter n value:");
    n=sc.nextInt(); 
    System.out.print("Enter " + n + " values:");
    for(int i=0; i<n; i++) {
	ll.add(sc.nextInt());
    }
    System.out.print("Enter the value to be searched:");
    int search = sc.nextInt();
    if(ll.contains(search)) {
    System.out.println("List after deletion");
    int v=ll.indexOf(search);  
    ll.remove(v);
    for(Integer i:ll)
	System.out.print(i+" ");
    }
    else
	System.out.println("Element not found");
    }
}