class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        
        for (int i = len - 1;i >= 0;i--){
            for (int j = i;j <= len-1;j++) {               
                if (i == j) {
                     dp[i][j] = 1;
                }
                else if(s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;  //左下角的那个元素+2 而不是左边的元素，考虑"bbab"
                }
                else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]); // f(s[i:j]) = max(f(s[i+1:j]),f(s[i:j-1]))
                }
            }
        }
        return dp[0][len-1];
    }
}

/*
  DP, 构造上三角阵,双指针。
*/
