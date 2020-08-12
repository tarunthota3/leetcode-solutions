class Solution {
    public int climbStairs(int n) {
        if(n == 1)
            return 1;
        int one = 1;
        int two = 2;
        
        for(int i = 3; i<=n; i++){
            int three = one + two;
            one = two;
            two = three;
        }
        return two;
    }
    
}
