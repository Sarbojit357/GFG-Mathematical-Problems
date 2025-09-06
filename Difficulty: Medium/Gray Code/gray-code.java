import java.util.*;

class Solution {
    public ArrayList<String> graycode(int n) {
        ArrayList<String> result = new ArrayList<>();
        result.add("0");
        result.add("1");
        
        for (int i = 2; i <= n; i++) {
            int size = result.size();
            
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j));
            }
            
            for (int j = 0; j < size; j++) {
                result.set(j, "0" + result.get(j));
            }
            
            for (int j = size; j < 2 * size; j++) {
                result.set(j, "1" + result.get(j));
            }
        }
        
        return result;
    }
}
