class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i < s.length(); i++){
            String odd = getPalindrome(s, i , i);
            String even = getPalindrome(s, i , i+1);
            if(longest.length() < odd.length())
                longest = odd;
            if(longest.length() < even.length())
                longest = even;
        }
        return longest;
    }
    
    private static String getPalindrome(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1, right);
    }
}
