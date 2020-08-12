class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(char i : s.toCharArray()) {
            map1.put(i, map1.getOrDefault(i, 1) + 1);
        }
        for(char j : t.toCharArray()) {
            map2.put(j, map2.getOrDefault(j, 1) + 1);
        }
        
        return map1.equals(map2);
    }
}
