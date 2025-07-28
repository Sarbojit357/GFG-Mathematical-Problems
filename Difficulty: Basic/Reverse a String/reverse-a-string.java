// User function Template for Java

class Solution {
    public static String reverseString(String s) {
       char[] arr = s.toCharArray();
       int i = 0;
       int j = s.length() - 1;
       while(j>i){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
       return new String(arr);
    }   
}
