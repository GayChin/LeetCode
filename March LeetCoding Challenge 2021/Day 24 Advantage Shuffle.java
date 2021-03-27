class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        int [] ans = new int [A.length];
        
        //sort A
        Arrays.sort(A);
        
        //use max heap to deal with opponent biggest number first
        PriorityQueue <int[]> maxHeap = new PriorityQueue <> ((a,b) -> b[1] - a[1]);
            for(int i = 0; i < B.length ; i++){
                maxHeap.offer(new int []{i,B[i]});
            }
        
        
        int slow = 0 , fast = A.length-1;
     //if opponent biggest no > our biggest no we use the slowest number to deal with it 
    //since either way wont give us an advantage
    // otherwise use our biggest number to win advantage
        while(!maxHeap.isEmpty()){
  
            int[] b = maxHeap.poll();
            ans[b[0]] = b[1] >= A[fast] ? A[slow++] : A[fast--];
        }
            
        return ans;
    }
}
