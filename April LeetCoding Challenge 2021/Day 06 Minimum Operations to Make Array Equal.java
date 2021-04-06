class Solution {
    public int minOperations(int n) {
        int operations = 0;
        for (int i = 0 ; i < n/2 ; i++){
            // for example average is 5
            // the first number from (2 * i) + 1 is 1, 2nd number is 3, 5-3 =2 , so 3 need at least 2 moves to become 5
            operations += n- (2 * i+1) ;
        }
        return operations;
    }
}
