class Solution {
    public int myAtoi(String str) {
        str = str.trim();
​
        if(str.isEmpty() || Character.isAlphabetic(str.charAt(0)))
            return 0;
        
        boolean isNegative = false;
        if(str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }
        else if(str.charAt(0) == '+')
            str = str.substring(1);
        
        int count = 0;
        
        if(str.isEmpty() || !Character.isDigit(str.charAt(0)))
            return 0;
        
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i)))
                break;
            else
                count++;
        }
            
        try {
            int val = Integer.parseInt(str.substring(0, count));        
            System.out.println("val: " + val);
            if(isNegative)
                return val * (-1);
            else
                return val;
        }
        catch(NumberFormatException e) {
            if(isNegative)
                return Integer.MIN_VALUE;
            else
