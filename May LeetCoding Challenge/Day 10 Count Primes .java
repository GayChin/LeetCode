class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        boolean[] numbers = new boolean[n];
        System.out.println((int)Math.sqrt(n));
        
        // sqrt of 20 is 4, we only need to run 4 times, and 4*4 > half of n
        for (int p = 2; p <= (int)Math.sqrt(n); ++p) {
            if (numbers[p] == false) {
                //set multiple of j = true by adding j each loop
                for (int j = p*p; j < n; j += p) {
                    numbers[j] = true;
                }
            }
        }
        
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            if (numbers[i] == false) {
                ++numberOfPrimes;
            }
        }
        
        return numberOfPrimes;
    }
}
