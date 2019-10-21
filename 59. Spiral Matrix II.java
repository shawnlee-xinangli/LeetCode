class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n == 0) {
            return res;
        }
        
        int startrow = 0;
        int startcol = 0;
        int endrow = n-1;
        int endcol = n-1;
        int k = 1;
        
        while (k <= n*n) {
            for (int j = startcol; j <= endcol; j++) {
                res[startrow][j] = k++;
            }
            startrow++;
            for (int i = startrow;i <= endrow; i++) {
                res[i][endcol] = k++;
            }
            endcol--;
            for (int j = endcol;j >= startcol;j--) {
                res[endrow][j] = k++;
            }
            endrow--;
            for (int i = endrow;i >= startrow;i--) {
                res[i][startcol] = k++;    
            }
            startcol++;
        }
        return res;
    }
}

/*
  四个指针，不断缩小范围。
*/
