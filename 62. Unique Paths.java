class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        
        int[][] res= new int[m][n];
        res[0][0] = 1;
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    res[i][j] = res[i][j-1];
                }
                else if (j == 0) {
                    res[i][j] = res[i-1][j];
                }
                else {
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
            }
        }
        return res[m-1][n-1];
    }
}

/*
  DP，左边界和右边界都为1，General case为左边加上边，最后返回右下角的元素。
*/
