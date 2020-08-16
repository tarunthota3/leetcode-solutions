class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);
        int count = 0;
        int temp = Integer.MIN_VALUE;
        for(int[] i: intervals){
            if( temp > i[0])
                count++;
            else
                temp = i[1];
        }
        return count;
    }
}
