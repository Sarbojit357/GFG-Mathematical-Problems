// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            
            while (left < right && arr[left] == 0) left++;
            while (left < right && arr[right] == 1) right--;
            
            if (left < right) {
                // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
    }
}
