class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j< n; j++) {
                if (i == 0 && j != 0) {
                    grid[i][j] += grid[i][j-1]; 
                }
                if (i != 0 && j == 0) {
                    grid[i][j] += grid[i-1][j];
                }
                if (i !=0 && j !=0) {
                    grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}

/*
  Intuition: 写个helper method 求[0,0]到[i,j]的minPathSum, recursive，发现有点麻烦，java不方便，而且占内存。
  后来发现不用helper method可以直接DP update原数组中的每个点的值。
  因为遍历数组是往右和往下在遍历，这也就确保了每个数字左边和上边的元素是被更新过的，这时候取min便可得最小值。
*/
