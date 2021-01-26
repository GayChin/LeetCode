class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0)
            target -= ++k;
        // when target is even just have to go to -1 then 1 to solve the problem
        // when target is odd then have to go one more round to negative side, if current step is also odd then need to go one more time
        return target % 2 == 0 ? k : k + 1 + k%2;
    }
}
