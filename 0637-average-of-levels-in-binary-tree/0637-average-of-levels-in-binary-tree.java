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
//     public List<Double> averageOfLevels(TreeNode root) {
//         List<Double> ans = new ArrayList<>();
//         Queue<Integer> q = new LinkedList<>();
//         double k = 0;
//         int j = 0;

//         while(!q.isEmpty()){
//             k = k+q.poll();
//             j++;            
//         }
//         k = k/j;
//         ans.add(k);
//         if(root.left != null){
//             averageOfLevels(root.left);
//         }
//         if(root.right != null){
//             averageOfLevels(root.right);
//         }
//         return ans;
//     }
// }

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                levelSum += current.val;

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(levelSum / levelSize);
        }

        return result;
    }
}