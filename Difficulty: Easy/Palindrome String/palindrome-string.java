class Solution {
    boolean isPalindrome(String s) {
        // code here
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        
        while(j>i){
            if(ch[i] == ch[j]){
                i++;
                j--;
            }
           else{
               return false;
           }
        }
        return true;
    }
}