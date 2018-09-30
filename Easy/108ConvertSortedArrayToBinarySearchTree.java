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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
        TreeNode treeNode = buildHelper(nums, 0, nums.length - 1);
        return treeNode;
    }
    
    private TreeNode buildHelper(int[] nums, int low, int high) {
        if(low > high) return null;
        int mid = (low + high) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = buildHelper(nums, low, mid - 1);
        treeNode.right = buildHelper(nums, mid + 1, high);
        return treeNode;
    }
}