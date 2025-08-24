// User function Template for Java

class Solution {
    int countSubstr(String S) {
        // your code here
        int ones = 0;
        for(int i =0; i<S.length(); i++){
            if(S.charAt(i) == '1'){
                ones++;
            }
        }
        return (ones*(ones - 1)) / 2;
    }
}