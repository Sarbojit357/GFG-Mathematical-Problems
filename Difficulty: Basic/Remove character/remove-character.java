// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            boolean found = false;
            for(int j = 0; j<str2.length(); j++){
                if(ch==str2.charAt(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                result.append(ch);
            }
        }
        return result.toString();
    }
}