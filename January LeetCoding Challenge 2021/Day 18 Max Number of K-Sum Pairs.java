class Solution {
    // TC: O(nlogn) SC: O(1)
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start =0;
        int end = nums.length-1;
        int count = 0;
        while(start<end){
            int sum = nums[start]+ nums[end];
            if(sum>k){
                end--;
            } else if(sum<k) {
                start++;
            } else{
                // sum ==k
                end--;
                start++;
                count++;
            }
        }
        return count;
    }
}
