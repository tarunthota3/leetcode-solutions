class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G' ||command.charAt(i) == 'a' || command.charAt(i) == 'l'){
                sb.append(command.charAt(i));
                c = ' ';
            }
                
            else if(command.charAt(i) == '('){
                c = '(';
                continue;
            }
            else if(command.charAt(i) == ')' && c == '('){
                sb.append('o');
                c = ' ';
            }
        }
        return sb.toString();
    }
}
