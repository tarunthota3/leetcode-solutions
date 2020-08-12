class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] out = {-1, -1};
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                out[0] = i;
                break;
            }
        }
        
        for(int j = nums.length-1; j>=0; j--){
            if(nums[j] == target){
                out[1] = j;
                break;
            }
        }
        return out;
    }
}
