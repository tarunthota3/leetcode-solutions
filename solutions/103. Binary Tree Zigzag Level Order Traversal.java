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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        getResult(list, 0 , root);
        return list;
    }
    
    public void getResult(List<List<Integer>> list, int level, TreeNode cur){
        if(cur == null)
            return;
        if (list.size() <= level) {
            list.add(new ArrayList<Integer>());
        }
        if (level % 2 == 0) {
            list.get(level).add(cur.val);
        }   else {
            list.get(level).add(0, cur.val);
        }
        getResult(list, level + 1, cur.left);
        getResult(list, level + 1, cur.right);
    }
}
