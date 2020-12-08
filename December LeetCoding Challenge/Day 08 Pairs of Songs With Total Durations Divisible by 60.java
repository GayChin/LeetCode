class Solution {
    public int numPairsDivisibleBy60(int[] times) {
        int [] modTimes = new int[60];
        for(int songTime : times)
            modTimes[songTime % 60]++;

        int totalPairs = 0;
        // find nC2
		totalPairs += findPairs(modTimes[0]);
		totalPairs += findPairs(modTimes[30]);
		  //find complementary pair between 1 - 59
        for(int i = 1; i <= 29; i++)
            totalPairs += modTimes[i] * modTimes[60 - i];
        
        return totalPairs;
    }
    
    //nC2 = n!/(2! * (n-2)!) which further simplifies to n*(n-1)/2)
    public int findPairs(int n){
        return n*(n-1)/2;
    }
}
