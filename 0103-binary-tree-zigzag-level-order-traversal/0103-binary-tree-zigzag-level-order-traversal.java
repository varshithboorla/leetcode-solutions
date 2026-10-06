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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<TreeNode> q = new LinkedList<>();
        int j = 0;
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
            if(j%2!=0)
                Collections.reverse(level);
            list.add(level);
            j++;
        }
        return list;
    }
}

// 20 9 