class Solution {
    public void moveZeroes(int[] nums) {
        int noOfZeros = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == 0) {
                noOfZeros++;
            }
            else {
                nums[j-noOfZeros] = nums[j];
            }
        }
        for(int i = nums.length-1; i > nums.length-1-noOfZeros; i-- ) {
            nums[i] = 0;
        }
    }
}
