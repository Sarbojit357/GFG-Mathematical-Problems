class Solution {
    static int sumOfDigits(int n) {
        // code here
        int rem = 0;
        int sum = 0;
        while(n>0){
           rem = n % 10;
           sum += rem;
           n = n / 10;
        }
        return sum;
    }
}
