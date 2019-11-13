class Solution {
    public int findCircleNum(int[][] M) {
        int count = 0;
        int[] visited = new int[M.length];
        for (int i = 0; i< M.length; i++) {
            if (visited[i] == 0) {
                dfs(M,i,visited);
                count ++;   
            }
        }
        return count; 
    }
    
    public void dfs(int[][] M,int i,int[] visited) {
        int n = M.length;
        for (int j =0;j<n;j++) {
            if (M[i][j] == 1 && visited[j] == 0){
                visited[j] = 1;
                dfs(M,j,visited);
            }
        } 
    }
}

DFS
