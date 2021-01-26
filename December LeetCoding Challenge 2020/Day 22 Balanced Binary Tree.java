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
    public boolean ok = true;
    public boolean isBalanced(TreeNode root) {
            if(root == null){
            return true;
        }
            // check the height of left side of the root
            int left = dfs(root.left,1);
            // check the height of left side of the root
            int right = dfs(root.right,1);
            return (Math.abs(left-right) <= 1 && ok);

    }
    
    public int dfs(TreeNode node, int depth){
        // we go back to previous depth
        if(node == null) return depth -1 ;
        //when we go to left add depth by 1 
        int left = dfs(node.left, depth+1);
        //when we go to right add depth by 1
        int right = dfs(node.right,depth+1);
        //compared the difference of left and right subtree
        if(Math.abs(left-right) >1 ) ok =false;
        
        return Math.max(left,right);
    } 
}
