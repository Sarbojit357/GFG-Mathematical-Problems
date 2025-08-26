// User function Template for Java
class Solution {
    long getSubstringWithEqual012(String str) {
        long ans = 0;
        int c0 = 0, c1 = 0, c2 = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("0#0", 1);
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0') c0++;
            else if (ch == '1') c1++;
            else c2++;
            
            int diff01 = c0 - c1;
            int diff02 = c0 - c2;
            String key = diff01 + "#" + diff02;
            
            if (map.containsKey(key)) {
                ans += map.get(key);
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        return ans;
    }
}    
    