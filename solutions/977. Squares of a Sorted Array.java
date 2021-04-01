class Solution {
    public int[] sortedSquares(int[] A) {
        int i=0;
        int j=A.length-1;
        int k=A.length-1;
        int[] ans=new int[A.length];
        while(i<=j){
            int val1=Math.abs(A[i]);
            int val2=Math.abs(A[j]);
             
            if(val2>val1){
                val2=val2*val2;
                ans[k]=val2;
                k--;
                j--;
            }else{
                val1=val1*val1;
                ans[k]=val1;
                k--;
                i++;
            }
        }
        return ans;
    }
}
