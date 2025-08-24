// User function Template for Java
class Solution {
    int sameChar(String A, String B) {
        // code here
        int count = 0;
        for(int i = 0; i<A.length(); i++){
            char a = Character.toLowerCase(A.charAt(i));
            char b = Character.toLowerCase(B.charAt(i));
            if(a==b){
                count++;
            }
        }
        return count;
    }
}