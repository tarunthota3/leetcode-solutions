class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0, p2 = 0, p3 = 0;
        int l1 = nums1.length, l2 = nums2.length;
        int[] res = new int[Math.max(l1, l2)] ;
        while(p1 < l1 && p2 < l2){
            while(p1 < l1 && nums1[p1] < nums2[p2])
                p1++;
            if(p1 == l1)
                break;
            while(p2 < l2 && nums1[p1] > nums2[p2])
                p2++;
            if(p2 == l2)
                break;
            while(p1 < l1 && p2 < l2 && nums1[p1] == nums2[p2]){
                res[p3] = nums1[p1];
                p1++;
                p2++;
                p3++;
            }
        }
        int[] out = new int[p3];
        for(int i = 0; i < p3; i++){
            out[i] = res[i];
        }
        return out;
        
    }
}
