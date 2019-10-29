class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        int count = 0;
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (grid[i][j] == '1') {
                    res ++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    
    public void dfs(char[][] grid, int row, int col) {
        grid[row][col] = 'T';
        int[][] adj = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        for (int[] m:adj) {
            int i = m[0] + row;
            int j = m[1] + col;
            if (inRange(grid,i,j) && grid[i][j] == '1' ) {
               dfs(grid, i, j); 
            }
        }
    }
    
    public boolean inRange(char[][] grid, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;
        return row >=0 && row < m && col >= 0 && col < n;
    }
}

/*
  DFS将相邻的'1'，全部变为'0'
  遇到'1'，res就+1
*/
