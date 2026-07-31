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
    public TreeNode helper(int[] preorder , int prelow , int prehi , int[] inorder , int inlow , int inhi){
        if(prelow > prehi) return null;
        TreeNode root = new TreeNode(preorder[prelow]);
        int i = inlow;
        while(inorder[i] != root.val)i++;

        int leftsize = i - inlow;

        root.left = helper(preorder, prelow+1, prelow + leftsize, inorder, inlow , i-1);
        root.right = helper(preorder,prelow+leftsize+1, prehi , inorder , i+1,inhi);
        return root;

    }




    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
}