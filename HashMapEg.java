import java.util.*;
class HashMapEg {
  public static void main(String args[]) {
	//Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(5,"John");
	hm.put(1,"Sam");
	hm.put(7,"Kim");
	for (Map.Entry<Integer, String> i : hm.entrySet()) {
		System.out.println(i.getKey() + " " + i.getValue());
	}
  }
}