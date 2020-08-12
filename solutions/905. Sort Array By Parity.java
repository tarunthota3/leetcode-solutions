class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] out = new int[A.length];
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){   
                out[count++] = A[i];
            }
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){   
                out[count++] = A[i];
            }
        }
        return out;
    }
}
