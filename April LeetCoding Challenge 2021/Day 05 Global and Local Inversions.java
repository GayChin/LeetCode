class Solution {
    public boolean isIdealPermutation(int[] A) {
        int max = -1;
        //local is part of global
        //but global can be more than local
        for(int i = 0; i < A.length-2 ; i++){
             max = Math.max(max,A[i]);
            //when global inversion occurs but local didnt
            if(max >A[i+2]){
                return false;
            }
        }
        return true;
    }
}
