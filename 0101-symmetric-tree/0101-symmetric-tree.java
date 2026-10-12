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
    boolean isSame(TreeNode root,TreeNode rroot){
        if(root==null&&rroot==null) return true;
        else if(root==null||rroot==null) return false;
        if(root.val!=rroot.val) return false;
        return isSame(root.left,rroot.right) && isSame(root.right,rroot.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSame(root.left,root.right);
    }
}