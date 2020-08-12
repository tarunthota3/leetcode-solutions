class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if(pattern.length() != arr.length)
            return false;
        
        Map map = new HashMap();
        for (Integer i=0; i < arr.length; ++i){
            if (map.put(pattern.charAt(i), i) != map.put(arr[i], i))
                return false;
        }
        System.out.println(map);
        return true;
    }
}
