class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] out = new int[nums.length];
        List<Integer> list = new ArrayList();
        for(int i = 0; i < n; i ++){
            System.out.println(i + " " + nums[i] + " "+ (i + 1) + " " +nums[i + n]);
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        Object[] objects = list.toArray();
        for (int i = 0; i<list.size(); i ++){
            out[i] = list.get(i);
        }
        return out;
    }
}
