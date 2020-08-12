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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        traverse(root, list);
        return list;
    }
    public void traverse(TreeNode root, List<Integer> list){
        if(root != null){
            if(root.left != null)
                traverse(root.left, list);
            if(root.right != null)
                traverse(root.right, list);
            list.add(root.val);
        }
    }
}
