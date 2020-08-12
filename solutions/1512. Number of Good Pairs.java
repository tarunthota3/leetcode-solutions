class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101];
        for(int num : nums){
            System.out.println(freq[num]);
            count +=freq[num]++;
        }
        System.out.println(Arrays.toString(freq));
        return count;
    }
}
