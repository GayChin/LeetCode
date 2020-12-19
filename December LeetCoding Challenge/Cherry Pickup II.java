class Solution {
    int[][] grid;
    int[][][] memo;
    int rows, cols;
    public int cherryPickup(int[][] grid) {
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        memo = new int[rows + 1][cols][cols];
        return grid[0][0] + grid[0][cols - 1] + compute(1, 0, cols - 1);
    }

    private int compute(int row, int r1, int r2) {
        if (row >= rows) {
            return 0;
        }
        int maxNum = 0; 
        //r1-1 and  r1+2 because move from -1 to 0 to 1 have 3 ways of going.
        for (int _r1 = r1 - 1; _r1 < r1 + 2; _r1++) {
            if (_r1 < 0 || _r1 >= cols) {
                continue;
            }
            for (int _r2 = r2 - 1; _r2 < r2 + 2; _r2++) {
                if (_r2 < 0 || _r2 >= cols || _r1 > _r2) {
                    continue;
                }
                // record cherries collected for each row
                int curRow = grid[row][_r1] + (_r1 == _r2 ? 0 : grid[row][_r2]);
                int next = memo[row + 1][_r1][_r2];
                if (next == -1) {
                    next = 0;
                } else if (next == 0) {
                    next = compute(row + 1, _r1, _r2);
                    memo[row + 1][_r1][_r2] = next == 0 ? -1 : next;
                }
                maxNum = Math.max(curRow + next, maxNum);
            }
        }
        return maxNum;
    }
}
