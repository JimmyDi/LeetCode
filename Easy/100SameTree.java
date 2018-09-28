// Recursion Method

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        if(p.val == q.val) return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
        return false;
    }
}

// Common Method

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        else if(p == null || q == null) return false;
        else if(p.val == q.val) {
            TreeNode left1 = p.left;
            TreeNode left2 = q.left;
            TreeNode right1 = p.right;
            TreeNode right2 = q.right;
            
            return isSameTree(left1, left2) && isSameTree(right1, right2);
        }
        
        else return false;
    }
}
