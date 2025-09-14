class Solution {
    public boolean checkSpy(int n) {
        // code here
        int m = n;
        int sum = 0, product = 1;
        while(n!=0){
            int d = n % 10;
            sum = sum + d;
            product = product * d;
            n = n / 10;
        }
        if(sum == product){
            return true;
        }
        else{
            return false;
        }
    }
}
