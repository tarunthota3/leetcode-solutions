class Solution {
    public int xorOperation(int n, int start) {
        int output = start;
        for(int i = 1; i<n; i++){
            output ^= start + (2*i);
        }
        return output;
    }
}
