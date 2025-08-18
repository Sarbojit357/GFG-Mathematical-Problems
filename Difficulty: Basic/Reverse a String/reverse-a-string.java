// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(j>i){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            
            i++;
            j--;
        }
        return new String(ch);
    }
}