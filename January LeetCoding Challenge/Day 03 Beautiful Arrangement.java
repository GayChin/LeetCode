public class Solution {
    int count = 0;
    public int countArrangement(int N) {
        int[] nums = new int[N];
        for (int i = 1; i <= N; i++)
            nums[i - 1] = i;
        permute(nums, 0);
        return count;
    }
    public void permute(int[] nums, int l) {
        if (l == nums.length) {
            count++;                            // i is the index to swap, l = subArray that have permutatation
        }                                       // E.g. if l = 1 , length = 3 ,means arr[l<n] all can still have                                                    permutation  
        for (int i = l; i < nums.length; i++) { 
            swap(nums, i, l);
            if (nums[l] % (l + 1) == 0 || (l + 1) % nums[l] == 0) //if X fulfill requirement skip remaning
                permute(nums, l + 1);
            swap(nums, i, l);       //swap back
        }
    }
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
