import java.util.*;
class RepeatString {
	public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter n value:");
	  int n = sc.nextInt();
	  String[] str = new String[n];
	  int keys[] = new int[n];
	  System.out.println("Enter names:");
	  for(int i=0; i<n; i++) {
		str[i]=sc.next();
	  }
	  HashMap<String,Integer> h1=new HashMap<String,Integer>();
	  for(int j=0; j<n; j++) {
		if(h1.containsKey(str[j]))   
		  h1.put(str[j],h1.get(str[j])+1);
		else
		  h1.put(str[j],1);
	  }
	  for(Map.Entry<String, Integer> k : h1.entrySet()) {
		if(k.getValue()>2)
		  System.out.println(k.getKey() + "=" + k.getValue());
	  }
	}
}