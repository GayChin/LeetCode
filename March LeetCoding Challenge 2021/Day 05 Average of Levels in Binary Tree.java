// bfs
// add root to a queue, poll it as node, add node value to the sum ,check its left and right got node or not , if yes add to the queue
// divide the sum with the size of the queue 
public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    List <Double> result = new ArrayList <>();
    if(root==null){
        return result;
    }
    Queue <TreeNode> q = new LinkedList<>();
    q.add(root);
    double sum = 0;
    while(!q.isEmpty()){
        int size = q.size();
        for(int i = 0 ; i < size ; i++){
            TreeNode node = q.poll();
            sum += node.val;
            if(node.left != null){
                q.add(node.left);
            }
             if(node.right != null){
                q.add(node.right);
            }
        }
        result.add(sum/size);
        sum = 0;
    }   
        
        return result;
    }
}
