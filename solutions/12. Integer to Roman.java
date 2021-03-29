class Solution {
     private final TreeMap<Integer, String> map = new TreeMap<>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};
    public String intToRoman(int num) {
        if(num < 1)
            return "";
        int reduce = map.floorKey(num);
        return map.get(reduce) + intToRoman(num - reduce);
    }
}
