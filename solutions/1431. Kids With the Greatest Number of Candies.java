class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        int max = getMax(candies);
        for(int i : candies) {
            list.add((i + extraCandies) >= max);
        }
        return list;
    }
    
    public int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i > max)
                max = i;
        }
        return max;
    }
    
}
