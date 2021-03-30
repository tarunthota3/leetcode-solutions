class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != 0 && nums[j] == 0){
                nums[j] = nums[i];
                nums[i] = 0;
            }
            while( j < i && nums[j] != 0) j++;
        }
    }
}
