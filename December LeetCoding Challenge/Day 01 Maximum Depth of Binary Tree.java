class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);  // depth first search 
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;    // if a root has left and right children, will choose the larger one
    }
}
