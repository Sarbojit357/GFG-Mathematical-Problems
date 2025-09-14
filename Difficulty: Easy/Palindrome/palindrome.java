class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int m = n;
        int sum = 0;
        while(n!=0){
            int d = n % 10;
            sum = sum*10 + d;
            n = n/10;
        }
        if(sum == m){
            return true;
        }
        else{
            return false;
        }
    }
}