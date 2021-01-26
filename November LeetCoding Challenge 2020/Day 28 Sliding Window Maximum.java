import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> al = new ArrayList();
        SortedMap<Integer, Integer> sm = new TreeMap<Integer,Integer>();
        
        for ( int i = 0 ; i < k ; i ++){
            Integer count = sm.get(nums[i]);
            if (count == null) sm.put(new Integer(nums[i]),1);
            else sm.put(new Integer(nums[i]), count + 1);
            
        }
        al.add(sm.lastKey());
        
        for ( int i = k ; i < nums.length ; i ++){
            // add the new number
            Integer count = sm.get(nums[i]);
            if (count == null) sm.put(new Integer(nums[i]),1);
            else sm.put(new Integer(nums[i]), count + 1);
            
            // remove the old number
            count = sm.get(nums[i-k]);
            if (count == 1) sm.remove(new Integer(nums[i-k])); 
            else sm.put(new Integer(nums[i-k]), count - 1);
            // add the largest element to result
            al.add(sm.lastKey());
        }
        int[] res = new int[al.size()];
        int i=0;
        for(Integer x : al){
            res[i++] = x;
        }
        return res;
    }
    //USING DP
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int resultLength = len-k+1;
        
        int[] left = new int[len];
        int[] right = new int[len];
        
        for(int i=0; i<len; i+=k) {
            int max = nums[i];
            int lastIndex = (i+k-1 >= len) ? (len-1) : (i+k-1);
            
            // calculate max num in blocks of k from left -> right
            // (every block will be of k size except last one)
            for(int j=i; j<= lastIndex; j++) {
                max = Math.max(max, nums[j]);
                left[j] = max;
            }
            
            // calculate max num in blocks of k from right -> left 
            // (every block will be of k size except last one)
            max = nums[lastIndex];
            for(int j=lastIndex; j>=i; j--) {
                max = Math.max(max, nums[j]);
                right[j] = max;
            }
        }
}
