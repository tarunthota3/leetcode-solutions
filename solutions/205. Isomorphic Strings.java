class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] recordS = new int[256];
        int[] recordT = new int[256];
        
        if(s.length() == 0 || t.length() == 0)
            return true;
        
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            int charS = s.charAt(i);
            int charT = t.charAt(i);
            
            if(recordS[charS] != recordT[charT])
                return false;
            if(recordS[charS] == 0){
                recordS[charS] = count;
                recordT[charT] = count;
                count++;
            }
        }
        return true;
    }
}
