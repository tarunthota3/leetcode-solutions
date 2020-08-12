class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        for(int i = arr.length - 2; i > -1; i--){
            int currVal = arr[i];
            arr[i] = max;
            max = Math.max(max, currVal);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
