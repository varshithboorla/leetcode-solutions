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
    void isInvert(TreeNode root){
        if(root==null) return;
        TreeNode re = root.left;
        root.left = root.right;
        root.right = re;
        isInvert(root.left);
        isInvert(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        isInvert(root);
        return root;
    }
}