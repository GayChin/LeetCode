class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0) return new int[0];
        int M=matrix.length,N=matrix[0].length;

        int[] result=new int[M*N];
        result[0]=matrix[0][0];//Initialization start position
        int i=0,j=0,k=1;
        while(k<N*M){
            //move up-right first
            while(i>=1&&j<N-1){ i--;j++;result[k++]=matrix[i][j];}
            
            //when we can't move up-right ,then move right one step
            if(j<N-1){ j++;result[k++]=matrix[i][j];}
            
            //if we can't move right,just move down one step 
            else if(i<M-1) { i++;result[k++]=matrix[i][j];}
            
            //After that,we will move down-left until it can't move
            while(i<M-1&&j>=1) { i++;j--;result[k++]=matrix[i][j];}
            
            //if we can't move down-left,then move down
            if(i<M-1){ i++;result[k++]=matrix[i][j];}
            
            //if we can't move down,just move right
            else if(j<N-1){ j++;result[k++]=matrix[i][j];}

        }
        
        return result;
    }
}
