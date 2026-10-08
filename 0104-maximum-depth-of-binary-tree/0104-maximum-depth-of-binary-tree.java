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
    int k = 0;
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        view(root, 1);
        return k;
    }

    void view(TreeNode root,int j){
        if(root==null){
            k = Math.max(j-1,k);
            return;
        } 
        view(root.left,j+1);
        view(root.right,j+1);
    }
}