class MyHashSet {
    /** Initialize your data structure here. */
    HashSet<Integer> myHashSet;
    public MyHashSet() {
        myHashSet = new  HashSet<Integer>();    
    }    
    public void add(int key) {
        myHashSet.add(key);
    }    
    public void remove(int key) {
        myHashSet.remove(key);
    }    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return myHashSet.contains(key);
    }
}
