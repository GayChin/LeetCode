class Solution {    
    public TreeNode increasingBST(TreeNode root) {
    List <Integer> vals = new ArrayList<>();
    inOrder(root, vals);
    TreeNode ans = new TreeNode(0);
    TreeNode cur = ans; //create a head reference
    for (int x : vals){
        cur.right = new TreeNode(x);
        cur = cur.right;
        
    }
        return ans.right;
    }

    public void inOrder (TreeNode node, List <Integer> vals){
    if(node == null) return;
    inOrder(node.left,vals);
    vals.add(node.val);  
    inOrder(node.right,vals);  //store every value in ascending order from left to right as left is always small
    
        
    }
}
