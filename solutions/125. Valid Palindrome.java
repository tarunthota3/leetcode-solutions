class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim().replaceAll("[^0-9a-z]", "");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equalsIgnoreCase(sb.toString()))
            return true;
        else
            return false;
    }
}
