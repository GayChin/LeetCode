class Solution {
    public int jump(int[] nums) {
        int l = 0;
        int r  = 0;
        int res = 0;
        
        while(r < nums.length - 1){
        //furthest is the furthest index we can reach from current index
            int furthest = 0;
            //Read index in range of left and right 
            for(int i = l ; i < r+1 ; i++){
                //get furthest by adding current index with steps that can be taken
                furthest = Math.max(furthest, i + nums[i]);
            }
            // next section will be the start from the left + 1 index
            l = r +1;
            r = furthest;
            res ++;

        }
        return res;
    }
}
