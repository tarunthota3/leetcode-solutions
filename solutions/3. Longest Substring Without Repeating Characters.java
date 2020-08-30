class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int n = s.length();
        int ans = 0, i = 0, j = 0;
        while(i < n && j < n){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i++));
                ans = Math.max(ans, i - j);
            }
            else{
                set.remove(s.charAt(j++));
            }
        }
        return ans;
    }
}
