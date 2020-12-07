class Solution {
    public Node connect(Node root) {
    if(root == null){
        return root;
    }
        Queue <Node> q  = new LinkedList<>();
        q.add(root); 
        
        
        while(!q.isEmpty()){
            int n = q.size();
            Node prev = null;
            for(int i = 0 ; i <n ; i++){
            Node cur = q.poll();
            if(cur.left != null){
              q.add(cur.left);
                
            }
            if(cur.right != null){
              q.add(cur.right);
                
            }
            if(prev != null){
                prev.next=cur;
                
            }
              prev = cur; 
            }
           
        }
        return root;
    }
        
    }
