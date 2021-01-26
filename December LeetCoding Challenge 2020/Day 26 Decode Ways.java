class Solution {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        Integer[] dp = new Integer[s.length()];
        return helper(chars, 0, dp);
    }
    
    private int helper(char[] chars, int index, Integer[] dp) {
        if(index>=chars.length) return 1; //Completion of decoding of full length string
        if(dp[index]!=null) return dp[index]; //dynamic programming cache similar answer
        if(chars[index]=='0') {                 
            dp[index]=0;
            return 0;
        }
        int value=chars[index]-'0';     // convert '1' to 1    
        int result = helper(chars,index+1,dp); //pointer increment by 1 each recursive
        
        if(index+1<chars.length) { // if two consecutive char didnt exceed string length    
            value = value*10+(chars[index+1]-'0'); 
            if(value<=26) {
                result += helper(chars, index+2, dp);
            }
        }
        dp[index]=result; //return dp[0] at last
        return result;
    }
}
