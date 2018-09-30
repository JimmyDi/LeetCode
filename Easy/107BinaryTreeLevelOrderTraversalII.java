// BFS
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null) return result;
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0; i < size; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            result.add(0, subList);
        }
        return result;
    }
}

// DFS

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        levelMaker(root, list, 0);
        return list;
    }
    
    private void levelMaker(TreeNode root, List<List<Integer>> list, int level) {
        if(root == null) return;
        if(level >= list.size()) {
            list.add(0, new LinkedList<>());
        }
        levelMaker(root.left, list, level + 1);
        levelMaker(root.right, list, level + 1);
        list.get(list.size() - level - 1).add(root.val);
    }
}