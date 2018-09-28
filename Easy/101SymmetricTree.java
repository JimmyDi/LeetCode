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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    private boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        else if(root1 == null || root2 == null) return false;
        return root1.val == root2.val &&
                    isMirror(root1.left, root2.right) &&
                    isMirror(root1.right, root2.left);
    }
}

// Small changes
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        else if(left == null || right == null) return false;
        return left.val == right.val &&
                    isMirror(left.left, right.right) &&
                    isMirror(left.right, right.left);
    }
}

// Queue Method
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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null) continue;
            else if(t1 == null || t2 == null) return false;
            if(t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }
}