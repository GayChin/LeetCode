class Solution {
    public int countBinarySubstrings(String s) {
        int curCon = 1 , prevCon =0 , ans =0;
        for (int i =1 ; i < s.length(); i++){
            //when currentNo is different from prevNo
            if(s.charAt(i) != s.charAt(i-1)){
                ans += Math.min(curCon,prevCon);
                prevCon = curCon;
                curCon=1;
            }else{ // currentConsecutive continues to increase
                curCon++;
            }
        }
        // last two groups of cons
        ans += Math.min(curCon,prevCon);
        return ans;
        
    }
}
