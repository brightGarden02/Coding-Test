class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        
        int p = 0;
        for(int x = 0; x < grid.size(); x++){
            for(int y = 0; y < grid[x].size(); y++){
                if(grid[x][y] == 1){
                    p += 4;
                    p -= getP(grid, x, y);
                }
            }
        }
        return p;
    }
    
    int getP(vector<vector<int>>& grid, int x, int y){
        
        int p = 0;
        if(x+1 < grid.size() && grid[x+1][y] == 1) p++;
        if(x-1 >= 0 && grid[x-1][y] == 1) p++;
        if(y+1 < grid[x].size() && grid[x][y+1] == 1) p++;
        if(y-1 >= 0 && grid[x][y-1] == 1) p++;
    
        return p;
    }
};