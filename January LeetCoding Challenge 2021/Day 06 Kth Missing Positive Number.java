Optimized  Binary Search Solution
class Solution {
    // TC O(logn) , SC O(1)
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length;
        while(low<high){
            int mid = (high -low)/2 + low;
            
            if(arr[mid] -(mid +1) >= k){
                high = mid;
            } else{
                low =mid+1;
            }
        }
        
        return low +k;
    }
}
