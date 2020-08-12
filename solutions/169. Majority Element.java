class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int mApp = nums.length/2;
        int output = nums[0];
        for(int i : map.keySet()){
            if(map.get(i) >= mApp && map.get(i) > map.get(output))
                output = i;
        }
        return output;
    }
}
