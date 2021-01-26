class Solution {
    int count =0;
    public int pseudoPalindromicPaths (TreeNode root) {
        
        int [] arr = new int [10]; // for 1- 9 digits
        dfs(root,arr);
        return count;
        
    }
    
    public void dfs(TreeNode node, int[]arr){
        if(node == null) return;
        arr[node.val]++;
        if(node.left == null && node.right == null){
            int oddParity =0;
            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i]%2 != 0){
                    oddParity++;    
                    if(oddParity>1){
                        break;
                    }
                }
            }
            if(oddParity <=1){
                count++;
            }
            
        }
        dfs(node.left, arr);
        dfs(node.right, arr);
        arr[node.val]--;
        
    }

}
