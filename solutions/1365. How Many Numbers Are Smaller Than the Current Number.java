class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copyArray = nums.clone();
        
        Arrays.sort(copyArray);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(copyArray[i] + " " + i);
            map.putIfAbsent(copyArray[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(map.get(nums[i]));
            copyArray[i] = map.get(nums[i]);
        }
        
        return copyArray;
    }
}
