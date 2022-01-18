class Solution {
public:
    int maxIncreaseKeepingSkyline(vector<vector<int>>& grid) {
        
        int n = grid.size();
        int ans = 0;
        vector<int> rows(n);
        vector<int> cols(n);
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rows[i] = max(rows[i], grid[i][j]);
                cols[j] = max(cols[j], grid[i][j]);
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans += min(rows[i], cols[j]) - grid[i][j];
            }
        }
        
        return ans;
    }
};