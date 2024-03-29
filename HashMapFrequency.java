import java.util.*;  
class HashMapFrequency {
    public static void main(String[] args)
    {
        int[] a = { 2,3,4,5,6,4,7,5,6,6};
        int n = a.length; 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                int c = map.get(a[i]);
                map.replace(a[i], c + 1);
	    }
            else
                map.put(a[i], 1);
	}
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > 1)
		System.out.println(i.getKey() + " " + i.getValue());
            else
                continue;
	}
    }
}