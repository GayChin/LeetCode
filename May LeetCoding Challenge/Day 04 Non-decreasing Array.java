class Solution {
    public boolean checkPossibility(int[] nums) {
        int leftBigger = 0;
        for (int i = 1 ; i < nums.length && leftBigger <= 1 ; i++){
            if(nums[i-1] > nums[i]){
                leftBigger +=1;
            if(i-2 < 0 || nums[i-2] <= nums[i] ){
                nums[i-1] = nums[i];
                System.out.println(nums[i-1]);
            }else{ // if nums[i-2] > nums[i], means nums[i-1] cannot be nums[i] to prevent decreasing
                nums[i] = nums[i-1]; 
            }
        }
      
    }
        return leftBigger <= 1;
}
}
