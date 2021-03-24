class Solution {
    public int numDecodings(String s) {
        char[] a = s.toCharArray();
        if (a.length != 0 && a[0] == '0') return 0;
        int n1 = 1, n2 = 1, n = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] == '0')
                n = 0;
            else
                n = n1;
            
            if((a[i - 1] == '0') || (a[i - 1] == '2' && a[i] > '6') || (a[i - 1] > '2'))
                n += 0;
            else
                n += n2;
            n2 = n1; n1 = n;
        }
        return n1;
    }
}
