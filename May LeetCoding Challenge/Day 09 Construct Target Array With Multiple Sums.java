class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue <Integer> pq  = new PriorityQueue <Integer>((a,b) -> (b-a));
        long total = 0;
        for(int a : target){
            total += a;
            pq.add(a);
        }
        while(true){
            //get largest element
            int a = pq.poll();
            // minus it with the remaining elements
            total -= a;
            
            if(a == 1 || total == 1 ){
                return true;
            }
            if(a < total || total == 0 || a%total == 0 ){
                return false;
            }
            a %= total; 
            pq.add(a);
            total += a;
        }
      
    }
}

