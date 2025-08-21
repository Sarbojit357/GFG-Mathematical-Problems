// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}
