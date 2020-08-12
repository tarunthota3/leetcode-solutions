class Solution {
    public int searchInsert(int[] nums, int target) {
        int p=Arrays.binarySearch(nums,target);
        return p>=0?
                p:
                -p-1;
    }
}
