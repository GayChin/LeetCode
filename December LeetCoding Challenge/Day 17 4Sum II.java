class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count=0;
        int len = A.length;
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int i =0 ; i< len ; i++){
            for(int j= 0; j< len ; j++){
                int sum = A[i] + B[j];
                map.put(sum, map.getOrDefault(sum,0)+1); // map.getOrDefault used to obtain prev frequency
            }
     
        }
        
        for(int i =0 ; i< len ; i++){
            for(int j= 0; j< len ; j++){
                int sum = C[i] + D[j];
                count += map.getOrDefault(-sum,0); 
            }
     
        }
        return count;
    }
}
