// /**
//  * Definition for a binary tree node.
//  * public class TreeNode { 
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int calculate(TreeNode root, int ttt ){
//         if(root == null) return 0;

//         int ls = calculate(root.left);
//         int rs = calculate(root.right);

//         ttt += Math.abs(ls - rs);

//         return ls + rs + root.val;
//     }
//     public int findTilt(TreeNode root) {
//         int ttt = 0;
//         calculte(root , ttt);
//         return ttt;
//     }
// }
class Solution {
    private int totalTilt = 0;

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        calculateSubtreeSum(root);
        return totalTilt;
    }

    private int calculateSubtreeSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = calculateSubtreeSum(node.left);
        int rightSum = calculateSubtreeSum(node.right);

        // Add the tilt of the current node to the total
        totalTilt += Math.abs(leftSum - rightSum);

        // Return total sum of subtree rooted at this node
        return node.val + leftSum + rightSum;
    }
}