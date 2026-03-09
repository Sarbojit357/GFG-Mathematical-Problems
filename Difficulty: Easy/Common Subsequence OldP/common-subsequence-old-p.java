// User function template for Java
class Solution {
    static int commonSubseq(String S1, String S2) {
        // code here
        boolean[] present = new boolean[256];
        
        for(int i = 0; i < S1.length(); i++){
            present[S1.charAt(i)] = true;
        }
        
        for(int i = 0; i < S2.length(); i++){
            if(present[S2.charAt(i)]){
                return 1;
            }
        }
        
        return 0;
    }
}