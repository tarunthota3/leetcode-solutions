class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> stack = new Stack();
        for(char c : S.toCharArray())
            if(Character.isLetter(c))
                stack.push(c);
        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray()){
            if(Character.isLetter(c))
                sb.append(stack.pop());
            else
                sb.append(c);
        }
        return sb.toString(); 
    }
}
