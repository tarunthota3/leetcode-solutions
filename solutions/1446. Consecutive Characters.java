class Solution {
    public int maxPower(String s) {
        int result = 1;
        for(int i = 1, c = 1; i < s.length(); ++i){
            if(s.charAt(i) == s.charAt(i-1))
                c++;
            else
                c = 1;
            result = Math.max(result, c);
        }
        return result;
    }
}
