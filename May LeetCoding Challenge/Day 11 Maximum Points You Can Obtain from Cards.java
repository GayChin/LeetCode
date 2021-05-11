class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left= 0, right = 0;
        //assume all the card Selected is on the right handside
        for (int i = cardPoints.length-1; i >= cardPoints.length-k ; --i){
          right += cardPoints[i];
        }
     
        // remove one from right and add one from left
        int result = right;
       
        for(int i = 0 ,  j = cardPoints.length -k ; i < k ; i++ , j++){
           left += cardPoints[i];
           right -= cardPoints[j];
           result = Math.max(result, left+right);
        }
        return result;
    }
}
