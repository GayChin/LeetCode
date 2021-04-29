class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = 0 , j = nums.length-1;
        int res [] = new int [] {-1,-1};
        if(nums.length == 0){
            return res;
        }
        while(i < j){
            int mid = (j+i)/2;
            if(target > nums[mid]){
                i = mid+1;
            }else {
                j = mid;
            }
            
        }
        if (nums[i] != target){
            return res;
        }else{
            res[0] = i;
        }
        
        j = nums.length-1;
        
        while(i < j){
            int mid = (j+i)/2 + 1;
            if(target < nums[mid]){
                j = mid -1;
            }else {
                i = mid;
            }
            
        }
       res[1] = j;
        return res;
        
    }
}
