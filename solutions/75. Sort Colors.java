class Solution {
    public void sortColors(int[] nums) {
        int first = 0, last = nums.length - 1;
        int mid=first+1;
        for(int j = 0; j <=last;j++){
            while(nums[j] == 2 && j < last){
                int k = nums[j];
                nums[j] = nums[last];
                nums[last] = k;
                last--;
            }
            while(nums[j] == 0 && j > first){
                int k = nums[j];
                nums[j] = nums[first];
                nums[first] = k;
                first++;
            }
        }
        
    }
}
