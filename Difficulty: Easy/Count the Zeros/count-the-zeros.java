// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int sum = 0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            sum+=arr[i];
        }
        return n - sum;
    }
}
