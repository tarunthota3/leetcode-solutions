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
    public boolean validate(TreeNode node, Integer lower, Integer upper) {
        if(node == null)
            return true;
        int val = node.val;
        if(lower != null && val <= lower)
            return false;
        if(upper != null && val >= upper)
            return false;
        if(!validate(node.left, lower, val))
            return false;
        if(!validate(node.right, val, upper))
            return false;
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}
