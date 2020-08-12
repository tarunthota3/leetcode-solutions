class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 2)
                    queue.offer(new int[]{i, j});
                else if(grid[i][j] == 1)
                    count_fresh++;
            }
        }
        if(count_fresh == 0)
            return 0;
        int count = 0;
        int[][] dir = {{1, 0},{-1, 0},{0, 1}, {0, -1}};
        while(!queue.isEmpty() && count_fresh > 0){
            count++;
            int size = queue.size();
            while(size-- > 0){
                int[] xy = queue.poll();
                for(int[] d : dir){
                    int x = xy[0] + d[0];
                    int y = xy[1] + d[1];
                    
                    if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    queue.add(new int[]{x, y});
                    grid[x][y] = 2;
                    count_fresh--;
                }
            }
        }
        return count_fresh == 0 ? count : -1;
    }
