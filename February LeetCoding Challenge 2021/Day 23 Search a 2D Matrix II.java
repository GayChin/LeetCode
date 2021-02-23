//binary search
/* n * m matrix convert to an array => matrix[x][y] => a[x * m + y]
an array convert to n * m matrix => a[x] =>matrix[x / m][x % m]; */

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int start = 0, row = matrix.length , column = matrix[0].length;
        int end = row*col -1; //the total size of the 2D array
        
        while(start <= end){
            int mid = start + end /2;
            if(matrix[mid/col][mid%col] == target) return true;
            if(matrix [mid/col][mid%col < target){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        
        }
                                return false;
    }
}
