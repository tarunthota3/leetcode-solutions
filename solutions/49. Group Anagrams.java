class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for(String str : strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String key = String.valueOf(chr);
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}
