/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (isSame(s,t)) {
            return true;
        }  
        return isSubtree(s.left,t) || isSubtree(s.right,t);
    }
    
    private boolean isSame(TreeNode s, TreeNode t) {
        if (t == null && s == null) {
            return true;
        }
        if (t == null || s == null) {
            return false;
        }
        if (t.val != s.val) {
            return false;
        }
        return isSame(s.right, t.right) && isSame(s.left,t.left);
    }
}

/*
  对于TreeNode不能使用s.equals(t)来直接判断，需要自己写一个isSame Method来判断。
*/
