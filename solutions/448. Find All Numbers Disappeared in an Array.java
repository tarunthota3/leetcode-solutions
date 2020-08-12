class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i : nums)
            hashSet.add(i);
        
        for(int i=1; i<=nums.length; i ++){
            if(!hashSet.contains(i))
                list.add(i);
        }
        
        return list;
    }
}
