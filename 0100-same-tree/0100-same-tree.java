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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null)
            return false;
        Queue<TreeNode> pq = new LinkedList<>();
        Queue<TreeNode> qq = new LinkedList<>();
        pq.add(p);
        qq.add(q);
        if(p.val!=q.val) return false;
        while (!pq.isEmpty() && !qq.isEmpty()) {
            int ps = pq.size();
            int qs = qq.size();
            if(ps!=qs) return false;
            for (int i = 0; i < ps; i++) {
                TreeNode rp = pq.poll();
                TreeNode rq = qq.poll();
                boolean ipl = false;
                boolean ipr = false;
                boolean iql = false;
                boolean iqr = false;
                int pr = -100001;
                int pl = -100001;
                int qr = -100001;
                int ql = -100001;
                if (rp.left != null) {
                    pq.add(rp.left);
                    ipl = true;
                    pl = rp.left.val;
                }
                if (rp.right != null) {
                    pq.add(rp.right);
                    ipr = true;
                    pr = rp.right.val;
                }
                if (rq.left != null) {
                    qq.add(rq.left);
                    iql = true;
                    ql = rq.left.val;
                }
                if (rq.right != null) {
                    qq.add(rq.right);
                    iqr = true;
                    qr = rq.right.val;
                }
                if ((ipl != iql || ipr != iqr)||(pl!=ql|| pr!=qr)){
                    return false;
                }
            }
        }
        return true;
    }
}