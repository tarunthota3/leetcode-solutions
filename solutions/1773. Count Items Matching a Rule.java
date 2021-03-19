class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        for(List<String> l : items){
            switch(ruleKey){
                case "type":
                    if(l.get(0).equals(ruleValue))
                        count += 1;
                    break;
                case "color":
                    if(l.get(1).equals(ruleValue))
                        count += 1;
                    break;
                case "name":
                    if(l.get(2).equals(ruleValue))
                        count += 1;
                    break;
            }
        }
        return count;
    }
}
