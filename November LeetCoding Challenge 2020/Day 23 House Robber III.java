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
//solution 1
class Solution {
     HashMap <TreeNode, Integer> map = new HashMap();
    public int rob(TreeNode root) {
        int val = 0;
       
        if(root == null){
            return 0;
        }
        if(map.containsKey(root)){
            return map.get(root); //this part since the map contains the root (root.right.right), programe dont have to count again when rob(root.left) 
            
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
// Solution 2
class Solution {
     
    public int rob(TreeNode root) {
        int [] result = subRob(root);
        return Math.max(result[0],result[1]);
        
    }
    
    public int [] subRob (TreeNode root){
        if(root == null){
            return new int [2];
        }
        
        int [] left = subRob(root.left);
        int [] right = subRob(root.right);
        int [] results = new int[2];
        
        
        // one result will get son
        results [0] = Math.max(left[0],left[1])  + Math.max(right[0],right[1]);
        // another one get root and grandson
        results [1] = root.val + left[0] + right[0];
        return results;
        
    }
}
