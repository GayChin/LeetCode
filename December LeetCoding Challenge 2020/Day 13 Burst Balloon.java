class Solution {

public int maxCoins(int[] nums) {
    int n = nums.length; 
    int [] A = new int [n+2];
    // add 1 to front and behind.
    A[0] = A[n+1] =1; 
    for(int i = 0; i < n ; i++ ){
        A[i+1] = nums[i];
        
    }
    int [][] dp = new int [n+2][n+2];
   
    for (int j = 1 ; j <= n ; j++ ){ // set ending point
        for(int i = j ; i >= 1 ; i--) // set starting point
            for(int k = i ; k<=j ; k++){ // set number we wanna keep as last
                dp[i][j] = Math.max(dp[i][j], dp[i][k-1] + A[i-1]*A[k]*A[j+1] + dp [k+1][j]);
                
                
            }
        
    }
    return dp[1][n];
}
}
