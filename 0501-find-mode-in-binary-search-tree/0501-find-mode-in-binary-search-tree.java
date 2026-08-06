class Solution {
    Integer prev = null;
    int count = 0;
    int maxCount = 0;
    ArrayList<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] answer = new int[modes.size()];

        for (int i = 0; i < modes.size(); i++) {
            answer[i] = modes.get(i);
        }

        return answer;
    }

    void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null && prev == root.val) {
            count++;
        } else {
            count = 1;
        }

        if (count > maxCount) {
            maxCount = count;
            modes.clear();
            modes.add(root.val);
        } else if (count == maxCount) {
            modes.add(root.val);
        }

        prev = root.val;

        inorder(root.right);
    }
}