class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String output = "";
        for(int i = arr.length-1; i>=0; i--){
            System.out.println("yo"+ arr[i]+"dfdf");
            if(i!=0)
                output += arr[i] +" ";
            else
                output += arr[i];
        }   
       
        return output;
    }
}
