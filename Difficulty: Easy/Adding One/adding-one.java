import java.util.*;

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        Vector<Integer> result = new Vector<>();
        int n = arr.length;
        int carry = 1; // since we are adding 1

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.add(carry);
        }

        // reverse to maintain the most significant digit at start
        Collections.reverse(result);

        return result;
    }
}
