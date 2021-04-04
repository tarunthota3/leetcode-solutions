class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length-1;
        while(i < j){
            System.out.println(i +" " + j +" " +(j - i) * Math.min(height[i],height[j]));
            max = Math.max(max, (j - i) * Math.min(height[i],height[j]));
            // System.out.println(max);
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return max;
    }
}
