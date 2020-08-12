class Solution {
    int value(char r) 
    { 
        int res = 0;
        if (r == 'I') 
            res = 1; 
        if (r == 'V') 
            res = 5; 
        if (r == 'X') 
            res = 10; 
        if (r == 'L') 
            res = 50; 
        if (r == 'C') 
            res = 100; 
        if (r == 'D') 
            res = 500; 
        if (r == 'M') 
            res = 1000; 
        return res;
    }
    public int romanToInt(String s) {
        int total = 0;
        for(int i=0; i<s.length();i++){
            
            if (i+1 < s.length()) 
            {
                int c1Value = value(s.charAt(i));
                int c2Value = value(s.charAt(i+1));
                if(c1Value < c2Value) {
                    total = total+ c2Value-c1Value;
                    i++;
                }
                else {
                    total = total + c1Value;
                }
            }
            else{
                total = total + value(s.charAt(i));
            }
