class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String output = "1";
        for(int i = 2; i <= n; i++){
            output = helper(output);
        }
        return output;
    }
    String helper(String str){
        char ch = str.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<str.length();i++){
            if(str.charAt(i) != ch){
                sb.append(count).append(ch);
                ch = str.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }
}
