class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] is = new int[m*n];
        int[] js = new int[m*n];
        int c = 0;
        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                int num = numlive(board,i,j);
                if (board[i][j] == 1 && (num < 2 || num > 3)) {
                    is[c] = i;
                    js[c] = j;
                    c++;
                }
                else if(board[i][j] == 0 && num == 3) {
                    is[c] = i;
                    js[c] = j;
                    c++;
                }
            }
        }
        for (int k = 0;k < c;k++) {
            board[is[k]][js[k]] = 1 - board[is[k]][js[k]];
        }
    }
    
    public int numlive(int[][] board,int row,int col){
        int count = 0;
        for (int i = row - 1;i < row + 2;i++) {
            for (int j = col - 1;j < col + 2;j++) {
                boolean inRange = (i >= 0 && i < board.length &&
                    j >= 0 && j < board[0].length);
                if (!inRange || (i == row && j == col)) {
                    continue;
                }
                if (board[i][j] == 1) {
                    count ++;
                }
            }
        }
        return count;
    } 
}

/*
  题目要求simultaneously,所以只能新建两个数组来储存需要改变status的[i,j]，最后一次性改变。
  不能一边判断，一边改变。
*/
