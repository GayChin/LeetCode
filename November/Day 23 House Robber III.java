/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     HashMap <TreeNode, Integer> map = new HashMap();
    public int rob(TreeNode root) {
        int val = 0;
       
        if(root == null){
            return 0;
        }
        if(map.containsKey(root)){
            return map.get(root);
            
        }
        if(root.left != null){
            val += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null){
            val += rob(root.right.left) + rob(root.right.right);    
        }
        map.put (root, Math.max(root.val + val, rob(root.left) + rob(root.right)));
        return map.get(root);
    }
}
