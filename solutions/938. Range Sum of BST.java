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
    int range;
    public int rangeSumBST(TreeNode root, int L, int R) {
        range = 0;
        dfs(root, L, R);
        return range;
    }
    public void dfs(TreeNode node, int L, int R){
        if(node == null){
            range += 0;
            return;
        }
        if(node.val >= L && node.val<=R)
            range += node.val;
        if(node.val > L)
            dfs(node.left, L, R);
        if(node.val < R)
            dfs(node.right, L, R);
    }
}
