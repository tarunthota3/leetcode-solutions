class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        for(int i = 0; i< haystack.length(); i++) {
            System.out.println(i+ needle.length() + " " + haystack.length());
            if(i+needle.length() > haystack.length()) {
                System.out.println("if");
                break;
            }
            else {
                System.out.println("else");
                String check = haystack.substring(i, i+needle.length());
                System.out.println("i: " + i);
                if(check.equals(needle)) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}
