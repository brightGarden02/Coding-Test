class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> set = new HashSet<>();
        
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                
                if(set.contains(board[row][col]))
                    return false;
                else if(board[row][col] != '.')
                    set.add(board[row][col]);
                
            }
            set.clear();
        }
        
        for(int row = 0; row < 9; row++){
            for(int col = 0; col < 9; col++){
                
                if(set.contains(board[col][row]))
                    return false;
                else if(board[col][row] != '.')
                    set.add(board[col][row]);
            }
            set.clear();
        }
        
        int q = 0;
        while(q != 9){
            for(int p = 0; p < 9; p = p+3){
                
                for(int r = p; r < p+3; r++){
                    for(int c = q; c < q+3; c++){
                       if(set.contains(board[r][c]))
                           return false;
                        else if(board[r][c] != '.')
                            set.add(board[r][c]); 
                    }
                }
                set.clear();
            } 
            q = q+3;
        } 
        
        return true;
    }
}