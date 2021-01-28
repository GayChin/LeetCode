class Solution {
    public int concatenatedBinary(int n) {
        long res = 0;
        int bitLength = 1;
        int nextIncrease = 2;
        
        // the digit of binary number will increase by 1 at initial position*2 e.g. 2 4 8 16
        for (int i = 1; i <= n; i++) {
            if (i == nextIncrease) {
                nextIncrease *= 2;
                bitLength++;
            }
            
            // shift bit length for the concatenation of the next binary number
            // then use inclusive boolean logical incluse OR to compare with current integer i
            // res will auto return as long 
            res = (res << bitLength) | i;
            System.out.println(res);
            // prevent overflow
            res %= 1000000007;
        }
        
        return (int)res;
    }
}
