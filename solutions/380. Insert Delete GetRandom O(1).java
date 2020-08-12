class RandomizedSet {
    
    List<Integer> list;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList(); 
        rand = new Random(); 
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(list.contains(val))
            return false;
        return list.add(val);
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        int index = -1;
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) == val)
                index = i;
        }
        if(index == -1)
            return false;
        list.remove(index);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int rNum = rand.nextInt((list.size()-1 - 0) + 1) + 0;
        return list.get(rNum);
    }
}
​
/**
