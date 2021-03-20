class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        int minLength = Integer.MAX_VALUE;
        
        for(String s : strs){
            minLength = Math.min(minLength, s.length());
        }
        int low = 1;
        int high = minLength;
        while(low <= high){
            int middle = (low + high) /2;
            if(isCommon(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        
        return strs[0].substring(0, (low + high)/2);
    }
    
    private static boolean isCommon(String[] strs, int length){
        String str = strs[0].substring(0, length);
        for(int i = 1; i < strs.length; i++){
            if(!strs[i].startsWith(str))
                return false;
        }
        return true;
    }
}
