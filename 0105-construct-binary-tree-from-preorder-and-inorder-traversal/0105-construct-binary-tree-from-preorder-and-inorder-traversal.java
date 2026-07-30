import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> inorderIndex = new HashMap<>();
    private int preorderPointer = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderIndex.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }

        int rootValue = preorder[preorderPointer++];
        TreeNode root = new TreeNode(rootValue);

        int rootIndex = inorderIndex.get(rootValue);

        root.left = build(preorder, left, rootIndex - 1);
        root.right = build(preorder, rootIndex + 1, right);

        return root;
    }
}