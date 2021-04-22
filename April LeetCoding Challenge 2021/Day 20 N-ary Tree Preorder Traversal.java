class Solution {
    List  <Integer> list = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
        if(root == null){
            return list;
        }    
        //add root value
        list.add(root.val);
        for(Node node : root.children){
            preorder(node);
        }
        return list;
        
    }
}
