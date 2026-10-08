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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int el = 0;
            int qs = q.size();
            for(int i=0;i<qs;i++){
                TreeNode re = q.poll();
                el = re.val;
                if(re.left!=null) q.add(re.left);
                if(re.right!=null) q.add(re.right);
            }
            list.add(el);
        }
        return list;
    }
}