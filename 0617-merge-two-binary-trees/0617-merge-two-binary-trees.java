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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        int k = 0;
        if(root1 == null ){
            // k = root2.val;
            return root2;
        }
        if(root2 == null){
            // k = root1.val;
            return root1;
        }
        // if(root1 == null && root2 == null){
        //     return null;
        // }
            // k = root1.val + root2.val;
           TreeNode rootf = new TreeNode(root1.val + root2.val);
            rootf.left = mergeTrees(root1.left , root2.left);
            rootf.right = mergeTrees(root1.right , root2.right);
        
        return rootf;
    }
}