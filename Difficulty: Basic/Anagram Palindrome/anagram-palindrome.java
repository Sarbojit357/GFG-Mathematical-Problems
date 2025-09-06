
class Sol {
    int isPossible(String S) {
        int[] freq = new int[26];  
        for (char c : S.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) oddCount++;
        }
        
        if (oddCount > 1) return 0;
        return 1;
    }
}
