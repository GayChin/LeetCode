class Solution {
    public boolean reorderedPowerOf2(int N) {
        int [] ans = count (N);
        for(int i = 0 ; i < 31 ; i++){ // max int_value = 2^31
            if(Arrays.equals(ans,count(1 << i))){ //if the count of N matches count of any power of 2 number
                return true;
            }
        }
        return false;
    }
    
    public int [] count (int N){
        int [] ans = new int [10];
        while(N > 0){
            ans[N%10] +=1;
            N /= 10;
        }
        return ans;
    }
