class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        for(int i = 0; i <s.length(); i++){
            char curr = s.charAt(i);
            if(Character.isDigit(curr)){
                currentNumber = (currentNumber * 10) + (curr - '0');
                // System.out.println(currentNumber);
            }
            if(!Character.isDigit(curr) && !Character.isWhitespace(curr) || i == s.length() - 1){
                if(operation == '-'){
                    stack.push(-currentNumber);
                }
                else if(operation == '+'){
                    stack.push(currentNumber);
                }
                else if(operation == '*'){
                    stack.push(stack.pop() * currentNumber);
                }
                else if(operation == '/'){
                    stack.push(stack.pop() / currentNumber);
                }
                operation = curr;
                currentNumber = 0;
            }
        }
        // System.out.println(stack);
        int result = 0;
        while(!stack.isEmpty())
            result += stack.pop();
        return result;
    }
}
