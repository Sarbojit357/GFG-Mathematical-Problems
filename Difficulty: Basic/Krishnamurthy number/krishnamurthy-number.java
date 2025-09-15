// User function Template for Java

class Solution {
    static String isKrishnamurthy(int N) {
        // code here
        int m = N;
        int sum = 0;
        while(N!=0){
            int d = N % 10;
            int fact = 1;
            for(int i = 1; i<=d; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            N = N/10;
        }
        if(sum==m){
            return "YES";
        }else{
            return "NO";
        }
    }
};