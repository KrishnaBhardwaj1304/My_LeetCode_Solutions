
// class Solution {

//     public List<List<Integer>> helper(List<Integer> arr, List<List<Integer>> ans ,TreeNode root , int targetSum ){
//         if(root == null) return ans;
//         if(root != null && root.left == null && root.right == null){

//             arr.add(root.val);
//             if(root.val == targetSum){
//                 List<Integer> a = new ArrayList<>();
//                 for(int i = 0 ; i < arr.size() ; i ++){
//                     a.add(arr.get(i));
//                 }
//                  arr.remove(arr.size()-1);
//                  return ans;
//             }
//             arr.add(root.val);
//             helper(arr,ans,root.left,targetSum - root.val);
//             helper(arr,ans,root.right,targetSum - root.val);
//         }
//         return ans;
//     }

//     public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//         List <List<Integer>> ans = new ArrayList<>();
//         List <Integer> arr = new ArrayList<>();
//         helper(arr,ans,root,targetSum);
//         return ans;
//     }
// }


class Solution {

    public void helper(List<Integer> arr, List<List<Integer>> ans,
                       TreeNode root, int targetSum) {

        if (root == null) {
            return;
        }

        arr.add(root.val);

        
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                ans.add(new ArrayList<>(arr));
            }

            arr.remove(arr.size() - 1); 
            return;
        }

        helper(arr, ans, root.left, targetSum - root.val);
        helper(arr, ans, root.right, targetSum - root.val);

        arr.remove(arr.size() - 1); 
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        helper(arr, ans, root, targetSum);

        return ans;
    }
}