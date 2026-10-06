/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int qsize = q.size();
            for (int i = 0; i < qsize; i++) {
                TreeNode r = q.poll();
                level.add(r.val);
                if (r.left != null)
                    q.add(r.left);
                if (r.right != null)
                    q.add(r.right);
            }
            list.add(level);
        }
        return list;
    }
}