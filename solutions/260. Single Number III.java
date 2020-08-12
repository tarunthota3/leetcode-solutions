class Solution {
    public int[] singleNumber(int[] nums) {
        int[] out = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int j = 0;
        for(int i : map.keySet()){
            if(map.get(i) == 1)
                out[j++] = i;
        }
        
        return out;
    }
}
