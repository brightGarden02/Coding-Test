class Solution {
public:
    bool checkValid(vector<vector<int>>& matrix) {
        
       int n = matrix.size();
        
       set<int> rows;
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n; j++){
               rows.insert(matrix[i][j]);
           }
           if(rows.size() != n) return false;
           rows.clear();
       }
       
       set<int> cols;
       for(int i = 0; i < n; i++){
           for(int j = 0; j < n;j++){
               cols.insert(matrix[j][i]);
           }
           if(cols.size() != n) return false;
           cols.clear();
       }
        
       return true;
    }
};
