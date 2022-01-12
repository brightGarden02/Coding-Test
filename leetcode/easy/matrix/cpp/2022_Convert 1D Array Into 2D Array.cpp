class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        
        vector<vector<int>> ans;
        
        if(original.size() != m*n) return ans;
        
        int i = 0;
        for(int r = 0; r < m; r++){
            vector<int> tmp;
            for(int c = 0; c < n; c++){
                tmp.push_back(original[i]);
                i++;
            }
            ans.push_back(tmp);
        }
        
        return ans;
    }
};
