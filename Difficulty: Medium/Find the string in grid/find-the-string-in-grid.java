import java.util.*;

class Solution {
    int n, m;
    int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    
    public int[][] searchWord(char[][] grid, String word) {
        n = grid.length;
        m = grid[0].length;
        List<int[]> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == word.charAt(0) && exists(grid, word, i, j)) {
                    ans.add(new int[]{i, j});
                }
            }
        }
        
        // sort lexicographically
        ans.sort((a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        
        return ans.toArray(new int[ans.size()][]);
    }
    
    private boolean exists(char[][] grid, String word, int x, int y) {
        for (int[] d : dirs) {
            int i = x, j = y, k;
            for (k = 0; k < word.length(); k++) {
                if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != word.charAt(k)) break;
                i += d[0];
                j += d[1];
            }
            if (k == word.length()) return true;
        }
        return false;
    }
}
