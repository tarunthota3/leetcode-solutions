class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i : nums2){
            nums1[m++] = i;
        }
        Arrays.sort(nums1);
    }
}
