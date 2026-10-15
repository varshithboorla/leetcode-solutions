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
    boolean compare(TreeNode root,TreeNode subRoot){
        if(root==null&&subRoot==null) return true;
        else if(root==null||subRoot==null) return false;
        else if(root.val!=subRoot.val) return false;
        return compare(root.left,subRoot.left)&&compare(root.right,subRoot.right); 
    }
    int isIden(TreeNode root,TreeNode subRoot){
        if(root==null) return 0;
        boolean isCom = false;
        if(root.val==subRoot.val){
            isCom = compare(root,subRoot);
            if(isCom==true){
                return 1;
            } 
        }
        int i = isIden(root.left,subRoot);
        int j = isIden(root.right,subRoot);
        if(i==1)return 1;
        if(j==1)return 1;
        return 0;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        int n = isIden(root,subRoot);
        if(n==1) return true;
        return false;
    }
}