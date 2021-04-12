class Solution {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        int left = 1;
        int right = n;

        for(int i = 0; i < n; i++){
         // If k is even, increment by 1, else decrement by 1 (you can swap this order. Just be consistent)
         if(k % 2 == 0)
          res[i] = left++;
         else 
          res[i] = right--;

         // Keep swapping the reverses on each index until you do it k - 1 times.
         // Then rest of numbers should just ONLY incremements or ONLY decrements.
         if(k > 1)
          k--;
        }
        return res;
    }
}
