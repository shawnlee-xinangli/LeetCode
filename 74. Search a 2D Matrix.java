class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        
        int s = 0;
        int e = m*n-1;
        int mid = 0;
        while (s <= e) {
            mid = (s + e) /2;
            if (matrix[mid / n][mid % n] > target) {
                e = mid - 1;
            }
            else if (matrix[mid / n][mid % n] < target) {
                s = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}

/*
  把2D matrix看成一个 1D 的sorted list，然后BinarySearch。
*/
