class Solution {
public:
    int rows, cols;
    vector<vector<bool>> pacific, atlantic;
	vector<vector<int>> ans;    
    
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& mat) {
        
        if(!mat.size()) return ans;
        rows = mat.size(), cols = mat[0].size();
        
        pacific = atlantic = vector<vector<bool>>(rows, vector<bool>(cols, false));
        
        for(int i = 0; i < rows; i++){
            dfs(mat, pacific, i, 0);
            dfs(mat, atlantic, i, cols - 1);       
        }
        
        for(int i = 0; i < cols; i++){
            dfs(mat, pacific, 0, i);
            dfs(mat, atlantic, rows - 1, i); 
        } 
        
        return ans;
    }
    
    void dfs(vector<vector<int>>& mat, vector<vector<bool>>& visited, int i, int j){        
        
        if(visited[i][j]) return;
        
        visited[i][j] = true;
        
        if(atlantic[i][j] && pacific[i][j]){
            ans.push_back(vector<int>{i, j});    
        } 
        
        if(i + 1 <  rows && mat[i + 1][j] >= mat[i][j]) dfs(mat, visited, i + 1, j); 
        if(i - 1 >= 0 && mat[i - 1][j] >= mat[i][j]) dfs(mat, visited, i - 1, j);
        if(j + 1 <  cols && mat[i][j + 1] >= mat[i][j]) dfs(mat, visited, i, j + 1); 
        if(j - 1 >= 0 && mat[i][j - 1] >= mat[i][j]) dfs(mat, visited, i, j - 1);
    }
};