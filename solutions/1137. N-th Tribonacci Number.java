class Solution {
    public int tribonacci(int n) {
        int first = 0, second = 1, third = 1;
        if(n == 0)
            return first;
        if(n == 1 || n == 2)
            return second;
        while(n >2){
            int sum = first+second+third;
            first = second;
            second = third;
            third = sum;
            n--;
        }
        return third;
    }
}
