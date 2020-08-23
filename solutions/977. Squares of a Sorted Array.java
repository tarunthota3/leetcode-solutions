class Solution {
    public int[] sortedSquares(int[] A) {
        int[] arr = new int[A.length];
        for(int i = 0; i<A.length; i++){
            arr[i] = A[i] * A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
