public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int output = 0;
        while (n != 0) {
            output++;
            n &= (n - 1);
        }
        return output;
    }
}
