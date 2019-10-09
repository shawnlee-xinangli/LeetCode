class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minleft = minDepth(root.left);
        int minright = minDepth(root.right);
        if (minleft == 0 || minright == 0) {
            return 1+Math.max(minleft,minright);
        }
        return 1+Math.min(minleft,minright);
    }
}

/*
  Base case: root == null
  General case(两边都不为null): 1 + 较小值
  Special case(两边有任意一边为null): 1+ 不是0的那一边(有node的那一边)
*/
