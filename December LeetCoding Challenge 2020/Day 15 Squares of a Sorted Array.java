class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ppointer= 0 ;
    while( ppointer < n && nums[ppointer] <0){
        ppointer  +=1;
        
    }
    int npointer = ppointer -1;
    int [] ans = new int[n];
    int counter =0;
    while(npointer >= 0 && ppointer < n){
        if(nums[npointer]*-1 < nums[ppointer]){
            ans[counter] = nums[npointer]*nums[npointer];
            npointer -=1;
            
        }else{
            ans[counter] = nums[ppointer]*nums[ppointer];
            ppointer += 1;
        }
        counter +=1;
    }
        
     while(npointer >= 0){
     ans[counter] = nums[npointer]*nums[npointer];
     npointer -=1;
     counter +=1;
      
  }   
    while(ppointer < n){
    ans[counter] = nums[ppointer]*nums[ppointer];       
    ppointer +=1;
    counter +=1;
    }
        return ans;
}
}
