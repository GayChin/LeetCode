class Solution {
public boolean kLengthApart(int[] nums, int k) {

	for(int start = -1, i = 0; i < nums.length; i++) 
		if(nums[i] == 1) {
			if(start != -1 && i - start < k +1) return false;
			start = i;
		}
	return true;
}
}
