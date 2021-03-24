class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int right=0;
        int left=0;
        char arr[] = s.toCharArray();
        for(char i:arr){
            if(i == 'R') 
                right++;
            if(i == 'L') 
                left++;
            if(right == left){
                count++;
                right=0;
                left=0;
            }
        }
        return count;
    }
}
