class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            min += Math.min(nums[i], nums[i + 1]);
        }
        return min;
    }
}
