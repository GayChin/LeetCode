class Solution {
    // 0 : cannot be cover
    // 1 : put a camera here
    // 2 : no camera, can be covered (is null)
    int total = 0;
    public int minCameraCover(TreeNode root) {
        if(helper(root) == 0) {
            total +=1;
        }
        return total;
    }
    
    private int helper (TreeNode root){
        if(root == null) return 2;
        int left = helper (root.left);
        int right = helper (root.right);
        if(left == 0 || right == 0 ){
            total += 1;
            return 1;
        }
        if(left == 2 && right == 2){
            return 0;
        }else return 2; 
    }
}
