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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int j = 0;
        while(!q.isEmpty()){
            int s = q.size();
            
            for(int i=0;i<s;i++){
                TreeNode re = q.poll();
                boolean isl = false;
                boolean isr = false;
                if(re.left!=null){
                    q.add(re.left);
                    isl = true;
                }
                if(re.right!=null){
                    q.add(re.right);
                    isr = true;
                }
                if(!isl&&!isr){
                    return j+1;
                }
            }
            j++;
        }
        return j+1;
    }
}