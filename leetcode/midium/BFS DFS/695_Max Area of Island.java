class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int found = 0;
        int maxArea = 0;
        for(int row = 0; row < grid.length; row++){
            
            for(int col = 0; col < grid[0].length; col++){
                if(grid[row][col] == 1){
                    found = findIsland(grid, row, col);
                }
                maxArea = Math.max(maxArea, found);
            }
        }
        
        return maxArea;
    }
    
    public int findIsland(int[][] grid, int x, int y){
        
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] != 1)                return 0;
        
        // mark island visited
        grid[x][y] = 2;
        
        return 1 + findIsland(grid, x-1, y) + 
            findIsland(grid, x+1, y) +
            findIsland(grid, x, y+1) + 
            findIsland(grid, x, y-1);
    }
}