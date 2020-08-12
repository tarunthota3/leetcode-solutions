class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i: nums) {
            if(hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            }
            else {
                hashMap.put(i, 1);
            }
        }
        
        for(int i : hashMap.keySet()) {
            if(hashMap.get(i) == 1) {
                return i;
            }
        }
        
        return 0;
    }
}
