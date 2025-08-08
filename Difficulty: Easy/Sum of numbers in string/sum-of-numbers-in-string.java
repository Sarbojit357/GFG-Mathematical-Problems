
class Solution {
    public int findSum(String s) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); 
            } else {
                sum += num; 
                num = 0;    
            }
        }
        
        sum += num;
        return sum;
    }
}
