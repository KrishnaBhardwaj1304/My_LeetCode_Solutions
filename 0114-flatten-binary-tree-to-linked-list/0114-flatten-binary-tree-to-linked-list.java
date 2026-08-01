import java.util.*;

class Solution {

    public void helper(TreeNode root, List<TreeNode> arr) {
        if (root == null) {
            return;
        }

        // Preorder: root, left, right
        arr.add(root);

        helper(root.left, arr);
        helper(root.right, arr);
    }

    public void flatten(TreeNode root) {
        List<TreeNode> arr = new ArrayList<>();

        helper(root, arr);

        for (int i = 0; i < arr.size() - 1; i++) {
            TreeNode current = arr.get(i);

            current.left = null;
            current.right = arr.get(i + 1);
        }

        if (!arr.isEmpty()) {
            TreeNode last = arr.get(arr.size() - 1);
            last.left = null;
            last.right = null;
        }
    }
}