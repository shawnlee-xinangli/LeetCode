class Solution {
    public static int maxSubArray(int[] A) {
        int[] dp = new int[A.length];
        dp[0] = A[0];
        int max = A[0];
        for (int i = 1;i<A.length;i++) {
            dp[i] = dp[i-1] > 0 ? dp[i-1] + A[i]: A[i];
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
/*
  dp[0:i]最大的那个dp[],表示 A[0:i]中最大的那个subarray。
*/
