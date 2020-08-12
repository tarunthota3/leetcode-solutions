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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        level(list, root, 0);
        return list;
    }
    
    public void level(List<List<Integer>> list, TreeNode node, int height) {
        if(node == null)
            return;
        if(height >= list.size())
            list.add(new LinkedList<Integer>());
        list.get(height).add(node.val);
        level(list, node.left, height+1);
        level(list, node.right, height+1);
    }
    
}
