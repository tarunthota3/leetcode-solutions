class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] ch = S.toCharArray();
        int output = 0;
        for(char c : ch){
            if(J.indexOf(c) != -1)
                output++;
        }
        return output;
    }
}
