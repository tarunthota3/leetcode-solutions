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
    public int pathSum(TreeNode root, int sum) {
        int count = 0;
        if(root == null)
            return 0;
        count += pathSum(root.left, sum);
        count += pathSum(root.right, sum);
        count += getCount(root, sum);
        return count;
    }
    
    public int getCount(TreeNode root, int sum){
        if(root == null)
            return 0;
        sum = sum - root.val;
        int c = 0;
        if(sum == 0)
            c++;
        c += getCount(root.left, sum);
        c += getCount(root.right, sum);
        
        return c;
    }
}
