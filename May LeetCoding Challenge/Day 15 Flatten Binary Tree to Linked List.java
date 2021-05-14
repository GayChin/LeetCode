class Solution {
    private TreeNode nextNode =null;

    public void flatten(TreeNode root) {
     if(root == null) return;
     // get the rightmost node
     flatten(root.right);
     flatten(root.left);
     root.left = null;
     //set root.right to the previous root node.
     root.right = nextNo
     nextNode = root;
    }
}
// Basically set current node as the right node of the next root node.
