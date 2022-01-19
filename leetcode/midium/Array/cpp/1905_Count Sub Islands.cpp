class Solution {
public:
    vector<vector<bool>> vis;
    int moves[4][2] = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}, m, n, cnt = 0;
    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
        
        m = size(grid1), n = size(grid1[0]);
        vis.resize(m, vector<bool>(n));
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!vis[i][j] && grid2[i][j] == 1){
                    bool island = true;
                    if(dfs(grid2, grid1, i, j, island)){
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
    
    bool dfs(vector<vector<int>>& grid2, vector<vector<int>>& grid1, int i, int j, bool& island){
        
        if(i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || grid2[i][j] == 0) return true;
        
        if(grid1[i][j] == 0) island = false;
        vis[i][j] = true;
        
        for(int k = 0; k < 4; k++){
            dfs(grid2, grid1, i + moves[k][0], j + moves[k][1], island);
        }
        
        return island;
    }
};