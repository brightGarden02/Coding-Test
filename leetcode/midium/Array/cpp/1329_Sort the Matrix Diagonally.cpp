class Solution {
public:
    vector<vector<int>> diagonalSort(vector<vector<int>>& matrix) {
        
        unordered_map<int, priority_queue<int, vector<int>, greater<int>> > diagonal;
        int m = matrix.size(), n = matrix[0].size();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                diagonal[i-j].push(matrix[i][j]);
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
		matrix[i][j] = diagonal[i-j].top();
                diagonal[i-j].pop();
            }
        }
	    
        return matrix;
    }
};
