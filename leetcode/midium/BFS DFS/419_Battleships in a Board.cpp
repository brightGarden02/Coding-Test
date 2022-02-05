class Solution {
public:
    int countBattleships(vector<vector<char>>& board) {
        
        int m = board.size();
        int n = board[0].size();
        int ans = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'X'){
                    ans++;
                    dfs(board, i, j);
                }
            }
        }

        return ans;
    }
    
    
    void dfs(vector<vector<char>>& board, int i, int j){
        
        int m = board.size();
        int n = board[0].size(); 
        
        if(i < 0 || i >= m || j < 0 || j >= n || board[i][j] == '.') return;
        
        board[i][j] = '.';
        
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
        
    }
};
