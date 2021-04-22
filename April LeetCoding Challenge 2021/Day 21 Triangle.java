class Solution {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        int rows = triangle.size();
        int [] dp = new int [rows+1]; //avoid out of bound
        
        for (int i = rows-1; i>=0 ; i--){ //start from final row
            for(int j = 0 ; j <= i ; j++){ // index of each row
                int currentVal = triangle.get(i).get(j);
                dp[j] = Math.min(dp[j] , dp[j+1]) + currentVal;
            }
        }
        return dp[0];
    }
    

}
