class Solution {
    public int orangesRotting(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2) q.offer(new int[]{i, j});
            }
        }
        
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i = 0; i < size; i++){
                
                int[] idx = q.poll();
                int row = idx[0];
                int col = idx[1];
                if(row - 1 >= 0 && grid[row-1][col] == 1){
                    
                    grid[row-1][col] = 2;
                    q.offer(new int[]{row - 1, col});
                }
                if(col - 1 >= 0 && grid[row][col-1] == 1){
                    
                    grid[row][col-1] = 2;
                    q.offer(new int[]{row, col-1});
                }
                if(row + 1 < m && grid[row+1][col] == 1){
                    
                    grid[row+1][col] = 2;
                    q.offer(new int[]{row + 1, col});
                }
                if(col + 1 < n && grid[row][col+1] == 1){
                    
                    grid[row][col+1] = 2;
                    q.offer(new int[]{row, col+1});
                }
            }
            count++;
        }
            
        for(int[] array : grid){
            for(int fresh : array){
                if(fresh == 1) return -1;
            }
        }
        
        return count == 0 ? count : count-1;
    }
}