class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        int r = click[0];
        int c = click[1];
        //If踩雷，改为'X'，直接return
        if (board[r][c] == 'M') {
            board[r][c] = 'X';
            return board;
        }
        
        board[r][c] = numAdjMines(board,click); 
        //如果为0，recursively点击周围的8个点。
        if (board[r][c] == '0') {
            board[r][c] = 'B';
            for (int i = r-1;i<r+2;i++) {
                for (int j = c-1;j<c+2;j++) {
                    if (inRange(board, new int[]{i, j}) && board[i][j] == 'E') {
                        board = updateBoard(board, new int[]{i, j});
                    }
                }
            } 
        }
        return board;
    }
    //计算loc附近的点有都多少雷。
    private char numAdjMines(char[][] board, int[] loc) {
        assert inRange(board, loc);
        int r = loc[0];
        int c = loc[1];
        int count = 0;
        for (int i = r-1;i<r+2;i++) {
            for (int j = c-1;j<c+2;j++) {
                if (inRange(board, new int[]{i,j}) && board[i][j] == 'M') {
                    count ++;
                }
            }
        }
        return (char) (count + '0');
    }
    //判断loc是否在board里面,避免数组越界。
    private boolean inRange(char[][] board, int[] loc) {
        return loc[0]>=0 && loc[0]< board.length
            && loc[1]>=0 && loc[1]< board[0].length;
    }
}

