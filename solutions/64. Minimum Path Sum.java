class Solution {
    public int minPathSum(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        for(int row = 0; row < r; row++){
            for(int col = 0; col < c; col++){
                if(row == 0 && col == 0)
                    grid[row][col] = grid[row][col];
                else if(row == 0 && col != 0)
                    grid[row][col] += grid[row][col-1];
                else if(col == 0 && row != 0)
                    grid[row][col] += grid[row-1][col];
                else
                    grid[row][col] += Math.min(grid[row][col-1],grid[row-1][col]);
            }
        }
       return grid[r-1][c-1]; 
    }
}
