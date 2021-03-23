class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, i = 0;
        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i++));
            }
            set.add(c);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
