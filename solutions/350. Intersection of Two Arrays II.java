class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> arrayList = new ArrayList();
        int k = 0;
        for(int i = 0; i < nums1.length; i++) {
            for(int j = k; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    arrayList.add(nums2[j]);
                    k = j+1;
                    break;
                }
            }
        }
        int[] arr = new int[arrayList.size()]; 
        for(int i =0;i<arr.length; i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
