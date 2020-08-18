class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, count = 0;
        for(int i : nums){
            if(i == 1){
                count++;
                result = Math.max(result, count);
            }
            else
                count = 0;
        }
        return result;
    }
}
