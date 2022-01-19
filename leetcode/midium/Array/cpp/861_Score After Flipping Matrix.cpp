class Solution {
public:
    int matrixScore(vector<vector<int>>& grid) {
        
        for(int r = 0; r < grid.size(); r++){
            
            if(grid[r][0] == 0){
                for(int c = 0; c < grid[r].size(); c++){
                    if(grid[r][c] == 1) grid[r][c] = 0;
                    else grid[r][c] = 1;
                }
            }
        }
        
        for(int c = 0; c < grid[0].size(); c++){
            
            int sum = 0;
            for(int r = 0; r < grid.size(); r++){
                sum += grid[r][c];
            }

            if(sum < grid.size()-sum){
                for(int r = 0; r < grid.size(); r++){
                    if(grid[r][c] == 1) grid[r][c] = 0;
                    else grid[r][c] = 1;
                    }
                }
        }
        
        vector<string> v(grid.size());
        int i = 0;
        for(int r = 0; r < grid.size(); r++){
            for(int c = 0; c < grid[r].size(); c++){
                v[i] += to_string(grid[r][c]);
            }
            i++;
        }
        
        int ans = 0;
        for(int j = 0; j < v.size(); j++){
            ans += stoi(v[j], 0, 2);
        }
        
        return ans;
    }
};
