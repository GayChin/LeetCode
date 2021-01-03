class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if( original == null ) return cloned;
        return dfs( original, cloned, target );
    }
    
    public TreeNode dfs( final TreeNode original, final TreeNode cloned, final TreeNode target ) {
        if( original == target ) return cloned;
        if( original.left != null ) {
            TreeNode tmp = dfs( original.left, cloned.left, target );
            if( tmp != null ) return tmp; //recursion return value one by one to the first node
        }
        if( original.right != null ) {
           TreeNode tmp = dfs( original.right, cloned.right, target );
            if( tmp != null ) return tmp;
        }
        return null;
    }
}
