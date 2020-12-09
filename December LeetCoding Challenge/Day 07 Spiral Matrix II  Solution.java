class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int val = 1;
        while(val <= n*n){
            // fill top row form left to right
            for(int i = left ; i <=right; i++){
                matrix[top][i] = val++;
                
            }
            top++; //top row is filled
            
            // fill right column from top to bottom
            for(int i = top ; i <=bottom; i++){
                matrix[i][right] = val++;
                
            }
            right--; 
            
            // fill bottom row from right to left
             for(int i = right; i >=left; i--){
                matrix[bottom][i] = val++;
                
            }
            bottom--;
            
            // fill left column from bottom to top
            for(int i = bottom; i >=top; i--){
                matrix[i][left] = val++;
                
            }
            left++;
            
            
        }
        return matrix;
    }
}
