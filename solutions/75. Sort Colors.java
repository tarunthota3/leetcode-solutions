class Solution {
    public void sortColors(int[] nums) {
        int zeros =0;
        int ones=0;
        int twos =0;
        int n = nums.length;
        for(int i =0; i < n ; i++){
            if(nums[i] ==0){
                zeros++;
            }
            if(nums[i] ==1){
                ones++;
            }
            if(nums[i] ==2){
                twos++;
            }
        }
        int index =0;
        for(int i =0 ; i <zeros ;i++ ){
            nums[index] = 0;
            index++;
        }
        for(int i =0 ; i <ones ;i++ ){
            nums[index] = 1;
            index++;
        }
        for(int i =0 ; i <twos ;i++ ){
            nums[index] =2;
            index++;
        }
    }
}
