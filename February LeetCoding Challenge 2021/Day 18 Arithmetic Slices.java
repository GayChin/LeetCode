class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int sum = 0 , curr = 0;
        for (int i = 2; i < A.length; i++){
          if(A[i] - A[i-1] == A[i-1] - A[i-2]){
              curr +=1;
              sum += curr;
          }else {
              curr = 0;

          }
        
        
        }return sum;

    }
    }
