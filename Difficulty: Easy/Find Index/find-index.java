// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int start = -1, end = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==key){
                start = i;
                break;
            }
        }
        for(int j = arr.length-1; j>=0; j--){
            if(arr[j] == key){
                end = j;
                break;
            }
        }
        return new int[]{start,end};
        
    }
}