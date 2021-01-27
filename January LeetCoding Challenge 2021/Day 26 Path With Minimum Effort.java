class Solution {
    public int minimumEffortPath(int[][] heights) {
        
        int m = heights.length;
        int n = heights[0].length;
        int lo = 0;
        int hi = Integer.MAX_VALUE;
        while (lo < hi) {
            int mid = lo/2 + hi/2;


            boolean[][] visited = new boolean[heights.length][heights[0].length];
            if (canPass(heights, visited, heights[0][0], mid, 0, 0)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    private boolean canPass(int[][] heights, boolean[][] seen,
                        int curr, int cost, int i, int j) {

        
        if (i<0 || i>=seen.length || j<0 || j>=seen[0].length) return false;
        if (seen[i][j] || Math.abs(heights[i][j]-curr)>cost) return false;
        if (i==seen.length-1 && j==seen[0].length-1) return true;
        
        seen[i][j] = true;
        if (canPass(heights, seen, heights[i][j], cost, i+1, j))
            return true;
        if (canPass(heights, seen, heights[i][j], cost, i, j+1))
            return true;
        if (canPass(heights, seen, heights[i][j], cost, i-1, j))
            return true;
        if (canPass(heights, seen, heights[i][j], cost, i, j-1))
            return true;
        return false;
    }
}
