class Solution {
public:
    int m, n;
    vector<vector<int>> dp;
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        
        m = obstacleGrid.size(), n = obstacleGrid[0].size();
        dp.resize(m, vector<int>(n));
        
        return solve(obstacleGrid, 0, 0);
    }
        
    
    int solve(vector<vector<int>>& grid, int i, int j) {
        
        if(i < 0 || j < 0 || i >= m || j >= n) return 0;    // exceed range
    
        
        if(grid[i][j]) return dp[i][j] = 0;                 // found obstacle
        if(i == m - 1 && j == n - 1) return 1;              // finish
        
        if(dp[i][j]) return dp[i][j];                       // if already computed for current cell, just return the stored results
        
        return dp[i][j] = solve(grid, i+1, j) + solve(grid, i, j+1);
    }
};