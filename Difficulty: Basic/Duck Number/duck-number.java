// User function Template for Java

class Solution {
    static boolean check_duck(String N) {
        // code here
      if(N.charAt(0) == '0')
            return false;
      for(int i = 1; i<N.length(); i++){
          if(N.charAt(i) == '0') return true;
      }
      return false;
    }
}