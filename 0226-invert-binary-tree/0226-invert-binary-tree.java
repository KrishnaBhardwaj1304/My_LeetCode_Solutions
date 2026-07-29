
class Solution {

    public void helper (TreeNode root){
        if(root == null) return;
         TreeNode r = root;
         TreeNode a = root.left;
         root.left = root.right;
         root.right = a;
         helper (root.left);
         helper (root.right);
    }

    public TreeNode invertTree(TreeNode root) {
        TreeNode r = root;
        if(root == null || (root.left == null && root.right == null)) return r;

        helper(root);
        return root;
    }

}