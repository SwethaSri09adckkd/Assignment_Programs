import java.util.*;
class HashMapEgSal {
	public static void main(String args[]) {
	  Scanner sc = new Scanner(System.in);
	  Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
	  ht.put(101,50000);
	  ht.put(102,45000);
	  ht.put(103,35000);
	  ht.put(104,40000);
	  ht.put(105,45000);
	  TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>(ht);
	  System.out.println(tm);
	  System.out.print("Enter key Value:");
	  int key = sc.nextInt();
	  if(tm.containsKey(key)) {
		System.out.print("Enter the hike:");
		int b = sc.nextInt();
		System.out.print("{");
		for (Map.Entry<Integer,Integer> r : tm.entrySet()) {
		  if(key == r.getKey())
			System.out.print(r.getKey() + "=" + (r.getValue()+b) + "," + " ");
		  else
			System.out.print(r.getKey() + "=" + r.getValue() + "," + " ");
		}
		System.out.println("}");
	  }
	  else
		System.out.println("Value not found");
	}
}