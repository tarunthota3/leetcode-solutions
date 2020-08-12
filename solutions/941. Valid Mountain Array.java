class Solution {
    public boolean validMountainArray(int[] A) {
        int length = A.length;
        int i = 0;
        
        while(i+1 < length && A[i] < A[i+1])
            i++;
        
        if(i == 0 || i == length-1)
            return false;
        
        while(i+1 < length && A[i] > A[i+1])
            i++;
        
        return i == length-1;
        
    }
    
}
