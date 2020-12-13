class Solution {

public int maxCoins(int[] nums) {
    int n = nums.length;
    int[] A = new int[n + 2]; // For Padding since we wanna add 1 in front and behind of the array
    for(int i = 1; i <= n; i++) A[i] = nums[i-1];
    A[0] = A[n + 1] = 1;        //set first and last element as 1 
    int[][] dp = new int[n + 2][n + 2]; // it is basically a range for that stores the max coin withint that range for example [3,1,5,8] . dp[1][3] , means the max coin between
    for(int j = 1; j <= n; j++) {       //starting point                                                                                                                //3,1,5 
        for(int i = j; i >= 1; i--) {   // ending point
            for(int k = i; k <= j; k++) {   // k is the coin we wanna keep until last
                dp[i][j] = Math.max(dp[i][j], dp[i][k-1] + dp[k+1][j] + A[i-1] * A[k] * A[j+1]);
            }
        }
    }
    return dp[1][n]; // return the max coin from starting to the end point
}
  
}
