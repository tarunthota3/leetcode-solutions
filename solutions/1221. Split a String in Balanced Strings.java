class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int output=0;
        for(char c : s.toCharArray()){
            count += (c == 'L' ? 1 : -1);
            if(count == 0)
                output++;
        }
        return output;
    }
}
