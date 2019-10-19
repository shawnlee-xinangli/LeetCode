class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        if (cols == 0) return false;
        
        int i = 0;
        int j = cols-1;
        while (i <= rows-1 && j >= 0) {
            if (matrix[i][j] > target) {
                j--;
            }
            else if (matrix[i][j] < target) {
                i++;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

/*
  充分利用两条性质。如果target < matrix[i][j] 说明 target < matrix[0:i][j] 也就是target比j这一列下面的元素都小，只需要往左边寻找。
        Otherwise, 如果target > matrix[i][j] 说明 target > matrix[i][0:j] 也就是target比i这一行左边元素都大。，只需要往下面寻找。
        因此初始化matrix[i,j]为最右和最上的那个元素。
*/
