class BSTIterator {
    
    List <Integer> sortedList;
    int index;
    public BSTIterator(TreeNode root) {
        //list to contain or sorted node
        this.sortedList = new ArrayList <Integer>();
        
        //initially point to a non-existent small number
        this.index = -1;
        
        //Add all node into an arraylist
        this.inOrder(root);
    }
    
    public void inOrder (TreeNode root){
        if(root == null){
            return ;
        }
        
        this.inOrder(root.left);
        this.sortedList.add(root.val);
        this.inOrder(root.right);

    }
    public int next() {
        //get the next index
        return this.sortedList.get(++this.index);
    }
    
    public boolean hasNext() {
        return this.index + 1 < this.sortedList.size();
    }
}
