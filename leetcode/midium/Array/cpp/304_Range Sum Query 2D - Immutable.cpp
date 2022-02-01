class NumMatrix {
    vector<vector<long>> dp;
    
public:
    NumMatrix(vector<vector<int>>& matrix) {
        
        int colLen = matrix.size()+1, rowLen = matrix[0].size()+1;
        dp = vector<vector<long>>(colLen, vector<long>(rowLen, 0));
        
        for(int i = 1; i < colLen; i++){
            for(int j = 1; j < rowLen; j++){
                dp[i][j] = matrix[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];       
            }    
        }      
    }
    
    int sumRegion(int r1, int c1, int r2, int c2) {
        
        return (int)(dp[r2+1][c2+1] - dp[r2+1][c1] - dp[r1][c2+1] + dp[r1][c1]);
    }
};
