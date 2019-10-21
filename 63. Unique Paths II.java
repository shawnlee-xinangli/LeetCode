class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int width = obstacleGrid[0].length;
            int[] dp = new int[width];
            dp[0] = 1;
            for (int[] row : obstacleGrid) {
                for (int j = 0; j < width; j++) {
                    if (row[j] == 1) {
                         dp[j] = 0;
                    } 
                    else if (j > 0) {
                        dp[j] += dp[j - 1];
                    }    
            }
        }
        return dp[width - 1];
    }
}

/*
  dp[j]储存了上一行的path数量，更新时只需要自己加上左边的path的数量就可以了。
  比建立int[][] res更节约空间。
*/
