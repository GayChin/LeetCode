class Solution {
    public int missingNumber(int[] nums) {
    HashSet <Integer> set = new HashSet <>();
    for (int num : nums){
        set.add(num);
    }
    
    int maxRange = nums.length + 1; //include the last number 
    for (int i = 0 ; i < maxRange ; i++){
        if(!set.contains(i)){
            return i;
        }
        
    }
        
        return -1;
    }
}

//bit manipulation
// same number will get cancelled eventually , the number remaining is the missing number.
class Solution {
    public int missingNumber(int[] nums) {
    int missing = 0;
    //0 to n -1 range only
    //if the number exist in the array , they will eventually be cancelled by each other
    for (int i = 0; i <nums.length ; i++){
        missing ^= i^ nums[i];
    }
    // include n
    missing ^= nums.length;
    return missing;
    }
    
}
