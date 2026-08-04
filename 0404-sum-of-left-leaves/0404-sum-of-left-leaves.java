class Solution {

    public int sum(TreeNode root){
        if(root == null) return 0;

        int s = 0;

        if(root.left != null && root.left.left == null && root.left.right == null){
            s = s + root.left.val;
        }

        s = s + sum(root.left);
        s = s + sum(root.right);

        return s;

    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }
}