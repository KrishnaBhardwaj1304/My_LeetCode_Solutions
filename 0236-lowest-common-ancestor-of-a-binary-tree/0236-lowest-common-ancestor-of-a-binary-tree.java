/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {

//     public boolean contains(TreeNode root , TreeNode p){
//         if (root == null) return false;
//         if (root == p) return true;
//         return (contains(root.left , p) || contains(root.right , p));
//     }

//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(p == root || q == root) return root;
//         if(p == q) return p;
//         boolean leftp = contains(root.left, p);
//         boolean rightq = contains(root.right, q);
//         if(leftp && rightq || (!leftp && !rightq)) return root;
//         if(!leftp && rightq) return lowestCommonAncestor(root.right , p, q);
//         if(leftp && !rightq) return lowestCommonAncestor(root.left, p , q);
//         return root;
//     }
// }




class Solution {

    public boolean contains(TreeNode root, TreeNode p) {
        if (root == null) return false;
        if (root == p) return true;

        return contains(root.left, p) || contains(root.right, p);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;

        if (root == p || root == q)
            return root;

        boolean leftP = contains(root.left, p);
        boolean leftQ = contains(root.left, q);

       
        if (leftP && leftQ)
            return lowestCommonAncestor(root.left, p, q);

       
        if (!leftP && !leftQ)
            return lowestCommonAncestor(root.right, p, q);

        
        return root;
    }
}