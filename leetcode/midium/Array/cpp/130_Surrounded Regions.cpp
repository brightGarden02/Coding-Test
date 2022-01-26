class Solution {
public:
    int m, n;
    void solve(vector<vector<char>>& board) {
        
        m = board.size();
        n = board[0].size();
        
        dfs(board, 0, 0);
        
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                
                if(board[r][c] == 'O' && (r == 0 || c == 0 || r == m-1 || c == n-1)){
                    dfs(board, r, c);
                }
            }
        }
        
        
         for(int r = 0; r < m; r++){
             
            for(int c = 0; c < n; c++){
                
                if(board[r][c] == 'O'){
                   board[r][c] = 'X';
                }
                else if(board[r][c] == '#'){
                    board[r][c] = 'O';    
                }
            }
        }
    }
    
    void dfs(vector<vector<char>>& board, int r, int c){
        
        if(r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O') return;
        
        board[r][c]= '#';
        
        dfs(board, r+1, c);
        dfs(board, r-1, c);
        dfs(board, r, c+1);
        dfs(board, r, c-1);
        
    }
};