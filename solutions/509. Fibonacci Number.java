class Solution {
    public int fib(int N) {
        int first = 0, second = 1;
        if(N == 0)
            return first;
        if(N == 1)
            return second;
        while(N >1){
            int sum = first+second;
            first = second;
            second = sum;
            N--;
        }
        return second;
    }
}
