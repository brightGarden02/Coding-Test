class Solution {
public:
    int kthSmallest(vector<vector<int>>& matrix, int k) {
        
        int m = matrix.size(), n = matrix[0].size();
        vector<int> v(m*n, 0);
        int x = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                
                v[x] = matrix[i][j];
                x++;
            }
        }
        
        sort(v.begin(), v.end());
        
        return v[k-1];
    }
};