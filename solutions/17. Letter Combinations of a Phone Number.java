class Solution {
    List<String> output = new ArrayList<>();
    Map<Character, String> map = new HashMap<>();
    
    String phoneDigits;
    public List<String> letterCombinations(String digits) {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        if(digits.length() == 0)
            return output;
        phoneDigits = digits;
        getCombinations(0, new StringBuilder());
        return output;
    }
    
    void getCombinations(int index, StringBuilder path){
        if(path.length() == phoneDigits.length()){
            output.add(path.toString());
            return;
        }
        
        String letters = map.get(phoneDigits.charAt(index));
        for(char ch : letters.toCharArray()){
            path.append(ch);
            getCombinations(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }   
}
