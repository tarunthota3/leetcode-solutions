class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int aLength = a.length() - 1, bLength = b.length() - 1;
        while(aLength >= 0 || bLength >= 0){
            int sum = carry;
            if(aLength >= 0)
                sum += a.charAt(aLength) - '0';
            if(bLength >= 0)
                sum += b.charAt(bLength) - '0';
            System.out.println(sum);
            sb.append(sum % 2);
            carry = sum / 2;
            aLength--;
            bLength--;
        }
        if(carry>0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
