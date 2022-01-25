class Solution {
public:
    bool exist(vector<vector<char>>& board, string word) {
        
        if(word == "") return false;
        
        for(int r = 0; r < board.size(); r++){
            for(int c = 0; c < board[0].size(); c++){
                if(board[r][c] == word[0] && solve(board, word, r, c, 0)){
                    return true;       
                }
            }
        }
        
        return false;
    }
    
    bool solve(vector<vector<char>>& board, string word, int r, int c, int n){
    
        if(n == word.size()) return true; 
        
        if(r < 0 || r >= board.size() || c < 0 || c >= board[r].size() || board[r][c] != word[n]) return false;
            
        board[r][c] = '0';
        
        bool status = solve(board, word, r+1, c, n+1) ||  
                        solve(board, word, r, c+1, n+1) ||  
                        solve(board, word, r-1, c, n+1) ||  
                        solve(board, word, r, c-1, n+1); 
        
        board[r][c] = word[n];
		
        return status;
    }   
};