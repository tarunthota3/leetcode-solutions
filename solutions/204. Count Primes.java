class Solution {
    public int countPrimes(int n) {
        boolean[] npNumbers = new boolean[n];
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (npNumbers[i] == false) {
                c++;
                for (int j = 2; i*j < n; j++) {
                    npNumbers[i*j] = true;
                }
            }
        }
        
        return c;
    }
}
