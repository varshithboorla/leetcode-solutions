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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        // list.add(Math.round(root.val*100000)/100000);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int qsize = q.size();
            long su = 0;
            for(int i=0;i<qsize;i++){
                TreeNode re = q.poll();
                su+=re.val;
                level.add(re.val);
                if(re.left!=null) q.add(re.left);
                if(re.right!=null) q.add(re.right);
            }            
            // double s = Math.round(((double) su / level.size()) * 100000.0) / 100000.0;
            double s = (double) su/level.size();
            list.add(s);
        }
        return list;
    }
}