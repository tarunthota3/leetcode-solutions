class Solution {
    Map<Character, Character> map;
    
    public Solution() {
        map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                char temp = stack.empty() ? '!' : stack.pop();
                
                if(temp != map.get(c))
                    return false;
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
