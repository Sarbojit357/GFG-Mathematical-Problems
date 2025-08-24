// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        result.append(Character.toUpperCase(s.charAt(0)));
        
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i-1)== ' '){
                result.append(Character.toUpperCase(s.charAt(i)));
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}