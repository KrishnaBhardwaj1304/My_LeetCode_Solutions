
class Solution {

    public int noOfPath(TreeNode root , long targetSum){
        if(root == null) return 0;
        int count = 0;
        if((long)(root.val) == targetSum) count++;
        return count + noOfPath(root.left, (long)(targetSum) - (long)(root.val)) + noOfPath(root.right, (long)(targetSum)-(long)(root.val));
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int count = noOfPath(root, (long)(targetSum));
        count += (pathSum(root.left , targetSum) + pathSum(root.right , targetSum));        
        return count;
    }
}