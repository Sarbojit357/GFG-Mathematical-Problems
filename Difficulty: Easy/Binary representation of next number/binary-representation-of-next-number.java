
class Solution {
    String binaryNextNumber(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = sb.length() - 1;
        int carry = 1;

        while (i >= 0 && carry > 0) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
                carry = 0;
            } else {
                sb.setCharAt(i, '0');
                carry = 1;
            }
            i--;
        }

        if (carry == 1) {
            sb.insert(0, '1');
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
