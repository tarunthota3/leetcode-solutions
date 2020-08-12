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
    List<List<Integer>> output = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        getCount(new ArrayList<>(), root, sum);
        return output;
    }
    public void getCount(List<Integer> list, TreeNode root, int sum){
        if(root == null)
            return;
        list.add(root.val);
        if(root.left == null && root.right == null && sum - root.val == 0){
            output.add(list);
            return;
        }
        getCount(new ArrayList<>(list), root.left, sum - root.val);
        getCount(new ArrayList<>(list), root.right, sum - root.val);
        
    }
}
