// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb1 = new StringBuilder();
        s.chars().distinct().forEach(c->sb1.append((char)c));
        return sb1.toString();
    }
}
