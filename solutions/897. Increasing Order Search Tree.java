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
    
    public TreeNode increasingBST(TreeNode root) {
        return inOrder(root, null);
        
    }
    public TreeNode inOrder(TreeNode node, TreeNode tail){
        if (node == null) 
            return tail;
        TreeNode res = inOrder(node.left, node);
        node.left = null;
        node.right = inOrder(node.right, tail);
        return res;
    }
}
