class Solution {
    HashMap<Character, Character> hmap = new HashMap<>();
    public boolean isValid(String s) {
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(hmap.containsKey(c)){
                char top = stack.empty() ? '@' : stack.pop();
                
                if(top != hmap.get(c))
                    return false;
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
