class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1]; // for dp[1] to dp[12] coinCount for each number from 1 to amount
        for(int i=1;i<=amount;i++){
            int min = Integer.MAX_VALUE;
            for(int coin:coins){
               if(i-coin>=0 && dp[i-coin] != -1)
                   min = Math.min(min, dp[i-coin]); //calculate the minimum coinCount
                System.out.println(min);
            }
            // Set dp[i] to -1 if i (current amount) can not be reach by  coins array
            dp[i] = min== Integer.MAX_VALUE ? -1 : 1+min;
        }
        return dp[amount];
    }
}
