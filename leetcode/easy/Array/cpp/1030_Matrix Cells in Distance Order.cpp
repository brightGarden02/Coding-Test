class Solution {
public:
    vector<vector<int>> allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        
        vector<pair<int, vector<int>>> disV;
        
        for(int i = 0; i < rows; i++){
            
            for(int j = 0; j < cols; j++){
                
                int d = abs(rCenter - i) + abs(cCenter - j);
                
                vector<int> tmpV;
                tmpV.push_back(i);
                tmpV.push_back(j);
                disV.push_back(make_pair(d, tmpV));
            }
        }
        
        sort(disV.begin(), disV.end());
        vector<vector<int>> ans;
        for(int i = 0; i < disV.size(); i++){
            ans.push_back(disV[i].second);
        }
        
        return ans;
    }
};
