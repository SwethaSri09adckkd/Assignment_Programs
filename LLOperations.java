import java.util.*;
class LLOperations {
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  LinkedList<Integer> ll = new LinkedList<Integer>();
  int n,ch;
  do {
 	System.out.println("1.BeginInsert\n2.EndInsert\n3.positionInsert\n4.BeginDelete\n5.EndDelete\n6.PositionDelete\n7.Display\n8.Exit\nEnter your choice:");
  	ch=sc.nextInt();
  	switch(ch) {
		case 1: System.out.print("Enter n value:");
        		n = sc.nextInt();
        		ll.addFirst(n);
        		break;
		case 2: System.out.print("Enter n value:");
        		n = sc.nextInt();
        		ll.addLast(n);
        		break;
		case 3: System.out.print("Enter n value:");
        		n = sc.nextInt();
        		System.out.print("Enter position: ");
       			int posi = sc.nextInt();
        		ll.add(posi-1,n);
        		break;
		case 4: ll.removeFirst();
        		break;            
		case 5: ll.removeLast();
		        break;
		case 6: System.out.println("Enter the position:");
		        int pos = sc.nextInt();
		        int in = ll.get(pos-1);
		        int y = ll.indexOf(in);
        		ll.remove(y);
        		break;
		case 7: System.out.println(ll);
		        break;
		case 8: System.exit(0);
		default: System.out.println("Please enter above options");
	}
  }while(ch<8);
  }
}
