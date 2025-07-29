// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        int j = 0; // Points to where the next non-zero should go

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap only if i != j to avoid unnecessary operations
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
