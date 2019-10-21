class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        int m = matrix.length;
         if (m == 0 ) {
            return res;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return res;
        }
        int startrow = 0;
        int startcol = 0;
        int endrow = m-1;
        int endcol = n-1;
        
        while (startrow <= endrow && startcol <= endcol) {
            for (int j = startcol;j <= endcol; j++) {
                res.add(matrix[startrow][j]);
            }
            startrow++;
            if (res.size() == m*n) break;
             for (int i = startrow;i <= endrow; i++) {
                res.add(matrix[i][endcol]);
            }
            endcol--;
            if (res.size() == m*n) break;
            for (int j = endcol;j >= startcol; j--) {
                res.add(matrix[endrow][j]);
            }
            endrow--;
            if (res.size() == m*n) break;
            for (int i = endrow;i >= startrow; i--) {
                res.add(matrix[i][startcol]);
            }
            startcol++;
        }
        return res;
    }
}


/*
  四指针法，但是要考虑 m!=n 的情况，遍历完一行或者一列就判断size的大小，当size达到m*n就break或者直接return。
*/
