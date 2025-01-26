//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            boolean flag = ob.armstrongNumber(n);
            if (flag) {
                System.out.println("true");

            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java


// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
       
       int count = (int) Math.log10(n)+1;
       
       int temp = n;
       
       int sum = 0;
       
       while(temp > 0){
           
           int lastDigit = temp % 10;
           
           sum += Math.pow(lastDigit, count);
           
           temp = temp / 10;
           
       }
       
       if(sum == n) return true;
       else return false;
    }
}