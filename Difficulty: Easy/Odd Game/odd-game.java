
class Solution {
    static Long oddGame(Long N) {
        // code here
        long ans = 1L;
        while (ans * 2 <= N) {
            ans *= 2;
        }
        return ans;
    }
};