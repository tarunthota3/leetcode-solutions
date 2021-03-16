class Solution {
    public int romanToInt(String s) {
        int res = 0, prev = 0, curr = 0;
        
        for(int i = (s.length()-1); i >= 0; i--){
            
            switch(s.charAt(i)){
                
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }
            if(curr < prev){
                res -= curr;
                prev = curr;
            }
            else{
                res += curr;
                prev = curr;
            }
            
            
        }
        
        return res;
​
    }
}
