// /*
// // Definition for a Node.
// class Node {
//     public int val;
//     public List<Node> children;

//     public Node() {}

//     public Node(int _val) {
//         val = _val;
//     }

//     public Node(int _val, List<Node> _children) {
//         val = _val;
//         children = _children;
//     }
// };
// */

// class Solution {
//     public List<Integer> preorder(Node root) {
//         List<Integer> ans = new ArrayList<>();
//         if(root == null){
//             return ans;
//         }
//         ans.add(root.val);

//         while(root.children != null){
//             preorder(root.children);
//         }
//     }
// }
class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        traverse(root);
        return result;
    }

    public void traverse(Node node) {
        if (node == null) {
            return;
        }

        result.add(node.val);

        for (int i = 0; i < node.children.size(); i++) {
            traverse(node.children.get(i));
        }
    }
}