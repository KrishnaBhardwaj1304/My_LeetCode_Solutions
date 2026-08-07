/**
 * Definition for a binary tree node.
 * public class TreeNode { 
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ttt = 0;
    public int calculate(TreeNode root){
        if(root == null) return 0;

        int ls = calculate(root.left);
        int rs = calculate(root.right);

        ttt += Math.abs(ls - rs);

        return ls + rs + root.val;
    }
    public int findTilt(TreeNode root) {
        calculate(root);
        return ttt;
    }
}