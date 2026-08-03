class Solution {
    public int minn(TreeNode root){

        if(root == null) return 0;

        if(root.left == null)  return 1 + minn(root.right);
        
        if(root.right == null) return 1 + minn(root.left);

        if(root.left == null && root.right == null) return 1;

        return 1 + Math.min(minn(root.left) , minn(root.right));

    }
    public int minDepth(TreeNode root) {
        return minn(root);
    }
}