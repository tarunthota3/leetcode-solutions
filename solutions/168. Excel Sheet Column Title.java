class Solution {
    public String convertToTitle(int n) {
        String title = "";
        while(n != 0) {
            title = (char)('A' + (n - 1) % 26) + title;
            n = (n - 1) / 26;
        }
        return title;
    }
}
