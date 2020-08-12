class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else{
            String s = String.valueOf(x);
            String rev = new StringBuilder(s).reverse().toString();
            if(s.equals(rev)){
                return true;
            }
            else{
                return false;
            }
        }
        
        
    }
}
