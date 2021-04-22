class Solution {
     public int combinationSum4(int[] nums, int target) {
            if(nums == null || nums.length ==0){
                return 0;
            }
            //dp[i] will represent the number of ways we can reach i from the starting point (dp[0]). This means that dp[T] will represent our final solution.
            int[] dp = new int[target+1];
         // onle self minus self can get 0, hence one way
            dp[0]=1; 
            for(int sum=0; sum<=target; sum++) {
                for(int num : nums) {
                    dp[sum] += sum-num>=0 ? dp[sum-num] : 0;

                } 
            }
            return dp[target];
        }

}
