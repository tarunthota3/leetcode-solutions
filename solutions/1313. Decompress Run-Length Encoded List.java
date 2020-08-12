class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i<nums.length-1; i+=2){
            size += nums[i];
        }
        int[] out = new int[size];
        int s = 0;
        for(int i = 0; i<nums.length-1; i+=2){
            int temp = nums[i];
            while(temp != 0){
                out[s++] = nums[i+1];
                temp--;
            }
        }
        return out;
    }
}
