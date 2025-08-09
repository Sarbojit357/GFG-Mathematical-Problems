// User function Template for Java

class Solution {
    static String ReFormatString(String S, int K) {
        // code here
          S = S.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int firstGroup = S.length() % K;
        int i = 0;
        if (firstGroup > 0) {
            sb.append(S.substring(0, firstGroup));
            i = firstGroup;
            if (i < S.length()) sb.append("-");
        }
        while (i < S.length()) {
            sb.append(S.substring(i, i + K));
            i += K;
            if (i < S.length()) sb.append("-");
        }
        return sb.toString();
        
    }
}