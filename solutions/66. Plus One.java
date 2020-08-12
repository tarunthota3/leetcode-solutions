class Solution {
    public int[] plusOne(int[] digits) {
       int length = digits.length;
        
        digits[length - 1] = digits[length-1] + 1;
        
        if(digits[length -1]>9) {
            for(int i = length - 1; i>0; i--) {
                if(digits[i]>9) {
                    digits[i] = 0;
                    digits[i-1] = digits[i-1] + 1;
                }
            }
        }
        if(digits[0]>9) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }
}
