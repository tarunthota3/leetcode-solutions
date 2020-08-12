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
    int tilt = 0;
    public int findTilt(TreeNode root) {
        findSum(root);
        return tilt;
    }
    
    public int findSum(TreeNode node){
        if(node == null)
            return 0;
        int left = findSum(node.left);
        int right = findSum(node.right);
        tilt += Math.abs(left-right);
        return left + right + node.val;
    }
}
