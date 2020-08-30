/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            sum = 0;
            while(size-- > 0){
                TreeNode top = queue.poll();
                sum += top.val;
                if(top.left != null)
                    queue.offer(top.left);
                if(top.right != null)
                    queue.offer(top.right);
            }
        }
        return sum;
    }
}
