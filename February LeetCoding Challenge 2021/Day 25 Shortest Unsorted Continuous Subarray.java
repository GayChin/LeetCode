public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l = 0, r = nums.length-1;
        int min = 10001, max = -100001;
        int start = 0 , end = -1;
        
        // compare two ways at the same time
        while(r >= 0){
            //check from left to right and obtain the biggest index that does not follow ascending order
            if(nums[l] >= max) {
                max = nums[l];
            } else {
                end = l;
            }
            //check from right to left and obtain the smallest index that does not follow descending order
            if(nums[r] <= min) {
                min = nums[r];
            } else {
                start = r;
            }
            l ++;
            r --;
        }
        return end -start +1;
}
}
