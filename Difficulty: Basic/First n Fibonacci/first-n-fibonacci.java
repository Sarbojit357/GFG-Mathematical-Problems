// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] result = new int[n];
        
        for(int i =0; i<n; i++){
            result[i] = fib(i);
        }
        return result;
        
    }
    
    private static int fib(int i){
        if(i==0) return 0;
        if(i==1) return 1;
        return fib(i-1) + fib(i-2);
    }
}