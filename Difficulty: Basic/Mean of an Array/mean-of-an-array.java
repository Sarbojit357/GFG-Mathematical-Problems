// User function Template for Java

class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum = 0;
        int mean = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        mean = sum/arr.length;
        return mean;
    }
};