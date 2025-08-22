// User function Template for Java

class Solution {

    public static int longest(int arr[]) {
        // write code here
        if (arr == null || arr.length == 0) return 0;
        int count = 1;
        int maxHeight = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>=maxHeight){
                count++;
                maxHeight = arr[i];
            }
        }
        return count;
    }
}
