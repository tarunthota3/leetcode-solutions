class Solution {
    public int maxSubArray(int[] nums) {
        int j = 0;
        int max = nums[0];
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            temp[i] = Math.max(temp[j] + nums[i], nums[i]);
            max = Math.max(max, temp[i]);
            j++;
        }
        return max;
    }
}
