class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList();
        for(int i : nums1){
            for(int j : nums2){
                if(i == j)
                    arr.add(i);
            }
        } 
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < arr.size(); i++)
            hashSet.add(arr.get(i));
        
        
        return hashSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
